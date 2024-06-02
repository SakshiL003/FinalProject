package com.bank.service;

import java.util.List;

import com.bank.entity.Bank;

public interface BankService {

	Bank createbank(Bank b);
	
	Bank updateBank(Bank b);
	
	List<Bank>getAllBank();
	
	Bank getBankById(int id);
	
	String deleteBank(int id);
}
