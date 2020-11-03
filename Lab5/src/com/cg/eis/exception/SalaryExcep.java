package com.cg.eis.exception;
public class SalaryExcep extends Exception {
	/**
	 * creating long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public SalaryExcep() { // class constructor
		super("Your salary below than 3000 "); // call super class
	}

}
