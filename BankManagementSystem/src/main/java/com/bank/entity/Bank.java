
package com.bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name="BANK_INFO")
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
	
	@Column(name="bankName")
	private String bankName;
	
	@Column(name="bankAddress")
	private String bankAddress;
	
	@Column(name="bankEmail")
	private String bankEmail;
	
	public Bank(String bankName, String bankAddress, String bankEmail) {
		super();
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankEmail = bankEmail;
	}

	
	
}
