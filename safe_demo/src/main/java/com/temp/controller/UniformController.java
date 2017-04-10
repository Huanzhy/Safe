package com.temp.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.temp.service.BankEmployeeService;
import com.temp.service.CardManageService;
//import com.temp.util.JsonUtil;
import com.temp.util.JsonUtil;

@Controller
@RequestMapping("/uniform")
public class UniformController {  
	
    @Autowired
    private BankEmployeeService bankEmployeeService;
    
    @Autowired
    private CardManageService cardManageService;
      
    @RequestMapping(value="/login", method={RequestMethod.GET, RequestMethod.POST}) 
    public void login(HttpServletRequest request, HttpServletResponse response) {  
    	//final String rawData = request.getParameter("info");
    	String rawData = JsonUtil.getRawData(request);
		try {
			String resJSON = bankEmployeeService.validateBankEmployee(rawData);
			PrintWriter writer = response.getWriter();
			writer.print(resJSON);			
		} catch (Exception e) {
			e.printStackTrace();
		}
    } 
    
    @RequestMapping(value="/getAccountsCustomersBoxs", method={RequestMethod.GET, RequestMethod.POST}) 
    public void getAccountsCustomersBoxs(HttpServletRequest request, HttpServletResponse response) {    	
		//final String rawData = request.getParameter("info");
		String rawData = JsonUtil.getRawData(request);
		try {
			String resJSON = cardManageService.getAccountsCustomersBoxsByCardRfid(rawData);
			
			PrintWriter writer = response.getWriter();
			writer.print(resJSON);			
		} catch (Exception e) {
			e.printStackTrace();
		}
    } 
    
    @RequestMapping(value="/test", method={RequestMethod.GET, RequestMethod.POST}) 
    public void test(HttpServletRequest request, HttpServletResponse response) {    	
    	System.out.println("-------------test-------------");
    	
    	//final String rawData = request.getParameter("info");
    	
    	String rawData = null;
    	try
		{
	    	//request.setCharacterEncoding("UTF-8");
			StringBuffer jb = new StringBuffer();
			String line = null;
		
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine()) != null) {
				jb.append(line);
			}
			System.out.println(jb);  
			
			rawData = jb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	PrintWriter writer;
		try {
			String utf8Str = java.net.URLDecoder.decode(rawData, "UTF-8");
			writer = response.getWriter();
			writer.print(utf8Str);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}  
