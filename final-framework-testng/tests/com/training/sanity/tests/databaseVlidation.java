package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.training.bean.DBBean;
import com.training.bean.RegisterBean;
import com.training.connection.GetConnection;
import com.training.utility.LoadDBDetails;

public class databaseVlidation {
	
	public static void main(String[] args) throws IOException {
        List<RegisterBean> list = getdata();
        
        Object[][] result = new Object[list.size()][]; 
        int count = 0; 
        for(RegisterBean temp : list){
            Object[]  obj = new Object[12]; 
            obj[0] = temp.getFirstName(); 
            obj[1] = temp.getLastName(); 
            obj[2] = temp.getEmail(); 
            obj[3] = temp.getTelephone(); 
            obj[4] = temp.getAddress1(); 
            obj[5] = temp.getAddress2(); 
            obj[6] = temp.getCity(); 
            obj[7] = temp.getPostCode(); 
            obj[8] = temp.getCountry(); 
            obj[9] = temp.getState(); 
            obj[10] = temp.getPassword(); 
            obj[11] = temp.getPasswordConfirm(); 
            
            result[count ++] = obj; 
        }
        System.out.println(result);
        for(Object[] a:result)
        {
            for(Object b: a)
                System.out.println(b);
        }
    }
        
        
    static List<RegisterBean> getdata() throws IOException {
    Properties properties = new Properties();
    FileInputStream inStream = new FileInputStream("./resources/sql.properties");
    properties.load(inStream);
    String sql = properties.getProperty("get.Register"); 
    
    GetConnection gc  = new GetConnection(); 
    List<RegisterBean> list = null;
    try {
        gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
        list = new ArrayList<RegisterBean>(); 
        
        gc.rs1 = gc.ps1.executeQuery(); 
        
        while(gc.rs1.next()) {
        
        	RegisterBean temp = new RegisterBean(); 
            temp.setFirstName(gc.rs1.getString(1));
            temp.setLastName(gc.rs1.getString(2));
            temp.setEmail (gc.rs1.getString(3));
            temp.setTelephone(gc.rs1.getString(4));
            temp.setAddress1(gc.rs1.getString(5));
            temp.setAddress2(gc.rs1.getString(6));
            temp.setCity(gc.rs1.getString(7));
            temp.setPostCode(gc.rs1.getString(8));
            temp.setCountry(gc.rs1.getString(9));
            temp.setState(gc.rs1.getString(10));
            temp.setPassword(gc.rs1.getString(11));
            temp.setPasswordConfirm(gc.rs1.getString(12));
            
list.add(temp); 
            
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return list; 
    }
}
