package yejin.shortenURL.test.services.interfaces;

import yejin.shortenURL.test.domains.ShortenUrl;
/**
 * 
 * @author yeeeah_j
 *
 */
public interface ShortenUrlInterface {
	public ShortenUrl getOriginUrl(final String idx);
	
	public String addOriginUrl(final ShortenUrl OriginUrl);
	
	public void deleteOriginUrl(long idx);
	//TODO: extend to list?

}
