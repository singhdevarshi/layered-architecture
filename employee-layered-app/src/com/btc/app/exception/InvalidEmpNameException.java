package com.btc.app.exception;

public class InvalidEmpNameException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public InvalidEmpNameException()
	{
		
	}
	public InvalidEmpNameException(String message)
	{
		super(message);
	}

}
