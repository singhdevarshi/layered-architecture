package com.btc.app.exception;

public class AlreadyExistException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public AlreadyExistException() {
			
		}
		
		public AlreadyExistException(String message) {
			super(message);
		}
}
