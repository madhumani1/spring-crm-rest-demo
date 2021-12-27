/**
 * 
 */
package com.madhu.demo.exception;

/**
 * @author 15197
 *
 */
public class CustomerErrorResponse {

	private int status;
	private long timeStamp;
	private String  message;
	/**
	 * @param status
	 * @param timeStamp
	 * @param message
	 */
	public CustomerErrorResponse(int status, long timeStamp, String message) {
		this.status = status;
		this.timeStamp = timeStamp;
		this.message = message;
	}
	/**
	 * 
	 */
	public CustomerErrorResponse() {
		
	}
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * @return the timeStamp
	 */
	public long getTimeStamp() {
		return timeStamp;
	}
	/**
	 * @param timeStamp the timeStamp to set
	 */
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}
