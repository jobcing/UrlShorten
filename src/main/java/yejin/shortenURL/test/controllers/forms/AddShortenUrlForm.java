package yejin.shortenURL.test.controllers.forms;
/**
 * 
 * @author yeeeah_j
 *
 */
public class AddShortenUrlForm {
	
	private String originUrl;
	
	/**
	 * Constructor.
	 */
	public AddShortenUrlForm(){
		
	}
	public AddShortenUrlForm(String originUrl){
		this.originUrl = originUrl;
	}
	
	public String getOriginUrl() {
		return originUrl;
	}
	public void setOriginUrl(String originUrl) {
		this.originUrl = originUrl;
	}
	
	

}
