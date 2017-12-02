package de.shingiro.bookstore;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class CDValidation extends ConstraintViolationException {

	public CDValidation(Set<? extends ConstraintViolation<?>> constraintViolations) {
		super(constraintViolations);
		// TODO Auto-generated constructor stub
	}

	
	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	Validator validator = factory.getValidator();
	
	// CD instance
	CD cd = new CD("Stoney", 9.99f);
	Set<ConstraintViolation<CD>> violations = validator.validate(cd);
}
