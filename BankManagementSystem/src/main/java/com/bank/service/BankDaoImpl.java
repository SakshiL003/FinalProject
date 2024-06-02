package com.bank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.BankRepository;
import com.bank.entity.Bank;
import com.bank.exception.BankNameNotFound;

@Service
public class BankDaoImpl  implements BankService{

	@Autowired
	BankRepository repo;
	
	@Override
	public Bank createbank(Bank b) {
	
		return repo.save(b);
	}

	@Override
	public Bank updateBank(Bank b) {
		Optional<Bank>bank=repo.findById(b.getId());
		if(bank.isPresent()) {
			Bank updatebankinfo=bank.get();
			updatebankinfo.setBankName(b.getBankName());
			updatebankinfo.setBankAddress(b.getBankAddress());
	
			updatebankinfo.setBankEmail(b.getBankEmail());
             repo.save(updatebankinfo);
			return updatebankinfo;
		}
		else{
			throw new BankNameNotFound("Bank details not available");
		}
	}

	@Override
	public List<Bank> getAllBank() {
		
		return repo.findAll();
	}

	@Override
	public Bank getBankById(int id) {
		Optional<Bank>bank=repo.findById(id);
		if(bank.isPresent()) {
			return bank.get();
		}
		else {
			throw new BankNameNotFound("Bank details not available");
		}
		
	}

	@Override
	public String deleteBank(int id) {
		
		Optional<Bank>bank=repo.findById(id);
		if(bank.isPresent()) {
			 repo.delete(bank.get());
		}
		else {
			throw new BankNameNotFound("Searching id not avaialable");
		};
		return "id deleted";
	}

}
