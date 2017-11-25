package yejin.shortenURL.test.controllers.responses.Data;
/**
 * 
 * @author yeeeah_j
 *
 */
public class ShortenUrlResponseData {
	private String shortIdx = "localhost:8080/shortenUrl/";
	public ShortenUrlResponseData(){
		
	}
	public ShortenUrlResponseData(String shortIdx){
		this.shortIdx += shortIdx;
	}
	public String getShortIdx() {
		return shortIdx;
	}
	public void setShortIdx(String shortIdx) {
		this.shortIdx += shortIdx;
	}


}
