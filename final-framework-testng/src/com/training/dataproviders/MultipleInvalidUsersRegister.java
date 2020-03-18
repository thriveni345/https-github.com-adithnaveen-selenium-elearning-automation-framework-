package com.training.dataproviders;

import org.testng.annotations.DataProvider;

import com.training.readexcel.ApachePOIExcelRead;

public class MultipleInvalidUsersRegister {
	
	@DataProvider(name= "MultipleInvalidUserRegistration")
	public Object[][] MinvalidRegister(){
		String FileName="C:\\Users\\ThriveniGorantla\\Documents\\Complex_UNF_063.xlsx";
		return new ApachePOIExcelRead().getExcelContent(FileName);
	}

}
