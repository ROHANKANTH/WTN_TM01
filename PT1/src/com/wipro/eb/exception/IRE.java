package com.wipro.eb.exception;

public class IRE extends Exception{
	public String toString() {
		return "your readings are incorrect";
	}
	public IRE()
	{
		super();
	}

}