package com.antonakospanos.oca.m09exceptions.examples;

public class MyCheckedException extends Exception {

	private static final long serialVersionUID = 2867481268410611779L;

	public MyCheckedException() {
		super();
	}

	public MyCheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MyCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyCheckedException(String message) {
		super(message);
	}

	public MyCheckedException(Throwable cause) {
		super(cause);
	}
}
