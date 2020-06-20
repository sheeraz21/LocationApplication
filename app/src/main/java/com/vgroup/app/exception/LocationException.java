package com.vgroup.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LocationException extends RuntimeException{
	
	
	private static final long serialVersionUID = 1L;
	
	 public LocationException(String message) {
	        super(message);
	    }

	    public LocationException(String message, Throwable cause) {
	        super(message, cause);
	    }

}
