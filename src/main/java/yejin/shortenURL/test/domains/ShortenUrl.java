package yejin.shortenURL.test.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 
 * @author yeeeah_j
 *
 */

@Entity
public class ShortenUrl {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idx")
	private long idx;
	
	@Column(name = "originUrl")
	private String originUrl;
	/**
	 * Constructor.
	 */
	public ShortenUrl(){
	}

	public ShortenUrl(String originUrl){
		this.originUrl = originUrl;
	}

	public long getIdx() {
		return idx;
	}
	public void setIdx(long idx) {
		this.idx = idx;
	}
	public String getOriginUrl() {
		return originUrl;
	}
	public void setOriginUrl(String originUrl) {
		this.originUrl = originUrl;
	}
	
	
	

}
