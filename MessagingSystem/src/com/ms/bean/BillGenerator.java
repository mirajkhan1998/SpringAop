package com.ms.bean;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class BillGenerator {
	public Bill generateBill(List<String> products, String mobileNo) {
		Bill bill = null;
		bill = new Bill();
		bill.setBillNo(new Random().nextInt());
		bill.setBillDate(new Date());
		bill.setAmount(500);
		bill.setIssuerName("Mathew");
		return bill;
	}

}
