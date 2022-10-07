package com.qac.corejava.OOPS.App;

import java.util.Scanner;

import com.qac.corejava.OOPS.App.dao.MyInstagramDAO;
import com.qac.corejava.OOPS.App.dto.MyInstagramDTO;

public class TestMyApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please provide username");
		sc.next();

		MyInstagramDTO dto = new MyInstagramDTO();
		dto.setName("Prajakta Shippure");
		dto.setEmailid("praji@yahoo.com");
		dto.setUsername("praju");
		dto.setPassword("Pps08");
		dto.setConfirmpassword("Pps08");
		dto.setPhoneno("9087654321");
		dto.setGender("Female");
		dto.setDob("08-Jan-2002");
		dto.setAddress("India");
		
		MyInstagramDTO dto1 = new MyInstagramDTO();
		dto1.setName("Swara Shinde");
		dto1.setEmailid("swara@yahoo.com");
		dto1.setUsername("swarashinde");
		dto1.setPassword("Ss09");
		dto1.setConfirmpassword("Ss09");
		dto1.setPhoneno("7087654391");
		dto1.setGender("Female");
		dto1.setDob("05-Sep-2001");
		dto1.setAddress("Newyork");
		
		MyInstagramDAO dao = new MyInstagramDAO();
		dao.register(dto);
		dao.register(dto1);
		dao.collection();
		dao.manage();
		
		String response = dao.login ("praji@yahoo.com","Pps08");
		System.out.println(response);
		
		String result = dao.deletemyaccount("swara@yahoo.com");
		System.out.println(result);
	}

}
