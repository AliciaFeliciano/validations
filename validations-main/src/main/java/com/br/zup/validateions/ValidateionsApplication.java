package com.br.zup.validateions;

import com.br.zup.validateions.controllers.dtos.UserRegisterDTO;
import org.springframework.validation.BindingResult;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Map;
import java.util.HashMap;

@SpringBootApplication
public class ValidateionsApplication {


	public Map<String, String> validateUser(UserRegisterDTO userRegisterDTO, BindingResult result) {
		Map<String, String> errors = new HashMap<>();

		if (result.hasErrors()) {
			result.getFieldErrors().forEach(fieldError ->
					errors.put(fieldError.getField(), fieldError.getDefaultMessage())
			);
		}

		if (!userRegisterDTO.YearBirthValidation()) {
			errors.put("yearOfBirth", "Ano de nascimento não corresponde à idade");
		}

		return errors;
	}
}
