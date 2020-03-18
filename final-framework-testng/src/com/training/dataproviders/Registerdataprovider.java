package com.training.dataproviders;

import org.testng.annotations.DataProvider;

import com.training.readexcel.ApachePOIExcelRead;

public class Registerdataprovider {
	
	@DataProvider(name= "MuserRegister")
	public Object[][] multiple(){
		
		String filename="C:\\Users\\ThriveniGorantla\\Documents\\complex_02.xlsx";
		return new ApachePOIExcelRead().getExcelContent(filename);
		
		
	}

}
