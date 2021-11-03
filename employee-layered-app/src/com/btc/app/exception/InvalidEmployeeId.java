package com.btc.app.exception;

public class InvalidEmployeeId extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public InvalidEmployeeId() {
			
		}
		
		public InvalidEmployeeId(String message) {
			super(message);
		}
}
