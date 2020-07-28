package com.example.spring5;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//public class EventValidator implements Validator {
//
//    @Override
//    public boolean supports(Class<?> aClass) {
//        //검사하는 클래스가 Event 클래스인지 맞는 비교
//        return Event.class.equals(aClass);
//    }
//
//    @Override
//    public void validate(Object o, Errors errors) {
//        //title이 notempty이기 때문에 에러 발생.
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title","notempty","Empty title alow");
//
//    }
//}
