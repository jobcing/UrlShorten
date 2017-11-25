package yejin.shortenURL.test.commons;
/**
 * 
 * @author yeeeah_j
 *	Url is not available.
 */
public class UrlAvailableException extends RuntimeException {

	private String message;
	public UrlAvailableException(){
		
	}
	public UrlAvailableException(String message){
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
