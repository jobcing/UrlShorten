package yejin.shortenURL.test.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import org.springframework.web.servlet.ModelAndView;
import yejin.shortenURL.test.commons.BadInputException;
import yejin.shortenURL.test.commons.NotInputException;
import yejin.shortenURL.test.commons.RangeOverException;
import yejin.shortenURL.test.commons.UrlAvailableException;
import yejin.shortenURL.test.controllers.responses.DefaultResponse;
import yejin.shortenURL.test.controllers.responses.DefaultResponse.Status;

@ControllerAdvice
public class ExceptionHandlingController {
	
	
	@ResponseStatus(org.springframework.http.HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = { UrlAvailableException.class})
	public @ResponseBody String urlAvailableHandler(RuntimeException ex, WebRequest request){
		System.out.println("Error : "+ex.getMessage());
		DefaultResponse dr = new DefaultResponse(Status.FAIL, ex.getMessage());
		return ex.getMessage();
		
	}
	
	
	@ResponseStatus(org.springframework.http.HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = { NotInputException.class})
	public @ResponseBody String notInputHandler(RuntimeException ex, WebRequest request){
		System.out.println("Error : "+ex.getMessage());
		DefaultResponse dr = new DefaultResponse(Status.FAIL, ex.getMessage());
		return ex.getMessage();
	}
	
	
	@ResponseStatus(org.springframework.http.HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = { RangeOverException.class})
	private ModelAndView rangeInputModelAndView(RuntimeException e){
		System.out.println("Error : " + e.getMessage());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/error_common");
		modelAndView.addObject("exception", e.getMessage());

		return modelAndView;
	}
	
	@ResponseStatus(org.springframework.http.HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = { BadInputException.class})
	private ModelAndView badInputModelAndView(RuntimeException e){
		System.out.println("Error : " + e.getMessage());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/error_common");
		modelAndView.addObject("exception", e.getMessage());

		return modelAndView;
	}

	@ExceptionHandler(Exception.class)
	private ModelAndView errorModelAndView(Exception e){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/error_common");
		modelAndView.addObject("exception", e);

		return modelAndView;
	}

}
