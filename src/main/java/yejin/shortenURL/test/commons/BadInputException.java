package yejin.shortenURL.test.commons;
/**
 * 
 * @author yeeeah_j
 *	User input Bad Shorten Url (not 0-9, a-z, A-Z)
 */
public class BadInputException extends RuntimeException{
	public String message;
	
	public BadInputException(){
		
	}
	public BadInputException(String message){
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
