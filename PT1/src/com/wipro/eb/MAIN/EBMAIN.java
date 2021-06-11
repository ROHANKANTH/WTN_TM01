package com.wipro.eb.MAIN;

import com.wipro.eb.service.connectionservice;

public class EBMAIN {

	public static void main(String[] args) 
	{
			System.out.println(new connectionservice().generatebill(130,100,"commercial"));
		
    }

}

