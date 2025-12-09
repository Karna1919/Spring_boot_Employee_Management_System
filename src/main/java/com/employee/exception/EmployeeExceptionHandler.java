package com.employee.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class EmployeeExceptionHandler {
	// @ResponseBody
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public String methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException invalidData, 
			Model model) {
		Map<String, String> invalidmsg = new HashMap<String, String>();
		invalidData.getBindingResult().getFieldErrors().forEach(error -> {
			invalidmsg.put(error.getField(), error.getDefaultMessage());
		});
		model.addAttribute("invalidmsg", invalidmsg);
		return "forward:/registrationPage";
	}

}
