package yejin.shortenURL.test.commons;
/**
 * 
 * @author yeeeah_j
 *	Request idx is over range
 */
public class RangeOverException extends RuntimeException{
	String message;
	
	public RangeOverException(String message){
		this.message= message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
