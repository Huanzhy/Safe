package com.temp.service;

import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;

import com.temp.baseTest.SpringTestCase;
import com.temp.service.BankEmployeeService;

public class UserServiceTest extends SpringTestCase {
	
	@Autowired  
    private BankEmployeeService userService; 
	
	@Test  
    public void selectUserByIdTest(){  
//        User user = userService.selectUserById(1);  
//        System.out.println(user.getUserName() + ":" + user.getUserPassword());
    }  
}