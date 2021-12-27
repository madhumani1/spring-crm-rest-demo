/**
 * 
 */
package com.madhu.demo.exception;

/**
 * @author 15197
 *
 */
public class CustomerNotFoundException extends RuntimeException {
	public CustomerNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomerNotFoundException(String message) {
		super(message);
	}

	public CustomerNotFoundException(Throwable cause) {
		super(cause);
	}
}
