package com.devoteam.ecommerce.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.devoteam.ecommerce.exception.EntiteAlreadyExistsException;
import com.devoteam.ecommerce.exception.EntiteNotFoundException;
import com.devoteam.ecommerce.exception.shared.ErrorMessage;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = {EntiteNotFoundException.class})
	public ResponseEntity<Object> entiteNotFoundException(EntiteNotFoundException ex){
		ErrorMessage errorMessage = new ErrorMessage.Builder()
				.message(ex.getMessage())
				.timestamp(new Date())
				.code(404)
				.build();
		
		return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = {EntiteAlreadyExistsException.class})
	public ResponseEntity<Object> entiteAlreadyExistsException(EntiteAlreadyExistsException ex){
		ErrorMessage errorMessage = new ErrorMessage.Builder()
				.message(ex.getMessage())
				.timestamp(new Date())
				.code(409)
				.build();
		
		return new ResponseEntity<>(errorMessage, HttpStatus.CONFLICT);
	}

}
