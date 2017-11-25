package yejin.shortenURL.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import yejin.shortenURL.test.commons.NotInputException;
import yejin.shortenURL.test.commons.RangeOverException;
import yejin.shortenURL.test.controllers.forms.AddShortenUrlForm;
import yejin.shortenURL.test.controllers.responses.DefaultResponse;
import yejin.shortenURL.test.controllers.responses.Data.ShortenUrlResponseData;
import yejin.shortenURL.test.domains.ShortenUrl;
import yejin.shortenURL.test.services.ShortenUrlService;

import java.net.URI;

/**
 * @author yeeeah_j
*/
@Controller
@EnableCaching
@RequestMapping("shortenUrl")
@Api
public class ShortenUrlController {
	
	@Autowired
	private ShortenUrlService shortenUrlService;
	
	/**
	 * Methods to add shortenUrl.
	 * @param asuf
	 * @return
	 */

	@PostMapping("")
	@ResponseBody
	public ResponseEntity<DefaultResponse> addShortenUrl(@RequestBody final AddShortenUrlForm asuf){

		if(asuf.getOriginUrl() == "") {
			throw new NotInputException("EMPTY");
		}

		System.out.println(asuf.getOriginUrl());
		ShortenUrl shortenUrl = new ShortenUrl(asuf.getOriginUrl());
		ShortenUrlResponseData shortenUrlResponseData = new ShortenUrlResponseData();
		shortenUrlResponseData.setShortIdx(shortenUrlService.addOriginUrl(shortenUrl));
		
		DefaultResponse dr = new DefaultResponse(shortenUrlResponseData);
		return new ResponseEntity<>(dr, HttpStatus.OK);
	}
	
	@GetMapping("/{idx}")
	public String getOriginUrl(@PathVariable("idx") final String idx){
		ShortenUrl shortenUrl = shortenUrlService.getOriginUrl(idx);
		if(shortenUrl == null){
			System.out.println("This Shorten Url is not found");
			throw new RangeOverException("This ShortenUrl is not Exist.");
		}

		return "redirect:" + shortenUrl.getOriginUrl();
	}
	
}
