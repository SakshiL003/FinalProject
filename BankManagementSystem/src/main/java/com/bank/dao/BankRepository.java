package com.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.entity.Bank;

@Repository
//@Repository behave like dao
public interface BankRepository extends JpaRepository<Bank,Integer> {

}
