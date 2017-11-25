package yejin.shortenURL.test.commons;
/**
 * 
 * @author yeeeah_j
 *	User do not enter longURL.
 */
public class NotInputException extends RuntimeException {
	public String message;
	
	public NotInputException(){
		
	}
	public NotInputException(String message){
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
