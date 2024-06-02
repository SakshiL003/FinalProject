package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.entity.Bank;
import com.bank.service.BankService;

@RestController
@RequestMapping("/api")
public class BankController {

	
	@Autowired
	
	BankService service;
	
	@PostMapping("/addBank")
	public Bank createBank(@RequestBody Bank b)
	{
		return service.createbank(b);
		
	}
	@PutMapping("/update/{id}")
	
	public Bank updateBankDetails(@PathVariable("id") int id,@RequestBody Bank b) {
		b.setId(id);
		return service.updateBank(b);
		
	}
	@GetMapping("/readAll")
	
	public List<Bank>getAllBankInfo(){
		return service.getAllBank();
		
	}
	@GetMapping("/read/{id}")
	public Bank getBankbyId(@PathVariable("id")int id) {
		return service.getBankById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteBankDetails(@PathVariable("id")int id) {
		return service.deleteBank(id);
	}
}
