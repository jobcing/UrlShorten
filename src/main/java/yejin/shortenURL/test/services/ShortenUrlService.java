package yejin.shortenURL.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import yejin.shortenURL.test.domains.ShortenUrl;
import yejin.shortenURL.test.repositories.ShortenUrlRepository;
import yejin.shortenURL.test.services.interfaces.ShortenUrlInterface;
import yejin.shortenURL.test.utils.AntilogarithmConversion;
import yejin.shortenURL.test.utils.Validator;
/**
 * 
 * @author yeeeah_j
 *
 */
@Service("ShortUrlService")
public class ShortenUrlService implements ShortenUrlInterface{
	@Autowired
	private ShortenUrlRepository sur;

	@Autowired
	private CacheManager cacheManager;
	
	@Override
	@Cacheable(value="findMemberCache", key="#idx")
	public ShortenUrl getOriginUrl(String idx) {
		// TODO Auto-generated method stub
		long DecimalIdx=AntilogarithmConversion.toDecimal(idx);
		return sur.findOne(DecimalIdx);
	}

	@Override
	public String addOriginUrl(ShortenUrl OriginUrl) {

		String tempUrl = Validator.validate(OriginUrl.getOriginUrl());

		OriginUrl.setOriginUrl(tempUrl);
		// TODO Auto-generated method stub
		ShortenUrl su =sur.save(OriginUrl);
		
		return AntilogarithmConversion.to62(su.getIdx());
		
	}

	@Override
	public void deleteOriginUrl(long idx) {
		// TODO Auto-generated method stub
		sur.delete(idx);
	}
}
