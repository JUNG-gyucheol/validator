package com.example.spring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

@Component
public class AppRuuner implements ApplicationRunner {

    //따로 Validator를 만들어 줄 필요없이
    //에노테이션으로 주입해서 사용
    @Autowired
    Validator validator;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(validator.getClass());

        Event event = new Event();
//        EventValidator eventValidator = new EventValidator();
        event.setLimit(-1);
        event.setEmail("aaaa2");
        Errors errors = new BeanPropertyBindingResult(event, "event");
        validator.validate(event, (Errors) errors);

        System.out.println(errors.hasErrors());

        errors.getAllErrors().forEach(e -> {
            System.out.println("=====error code=====");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });
    }
}
