package com.capgemini.files.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DebitCard implements Serializable {

	private long cardNo;
	private int cvv;
	private int expiryMonth;
	private int expiryYear;
	
	
	public DebitCard(long cardNo, int cvv, int expiryMonth, int expiryYear) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
	}
	public DebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	@Override
	public String toString() {
		return "DebitCard [cardNo=" + cardNo + ", cvv=" + cvv + ", expiryMonth=" + expiryMonth + ", expiryYear="
				+ expiryYear + "]";
	}
	


	
}
