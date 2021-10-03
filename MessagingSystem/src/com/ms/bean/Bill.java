package com.ms.bean;

import java.util.Date;

public class Bill {
	protected int billNo;
	protected Date billDate;
	protected String issuerName;
	protected double amount;

	public int getBillNo() {
		return billNo;
	}

	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public String getIssuerName() {
		return issuerName;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Bill [billNo=" + billNo + ", billDate=" + billDate + ", issuerName=" + issuerName + ", amount=" + amount
				+ "]";
	}

}
