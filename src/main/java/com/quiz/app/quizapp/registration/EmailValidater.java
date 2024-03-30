package com.quiz.app.quizapp.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;


@Service
public class EmailValidater implements Predicate<String> {
    @Override
    public boolean test(String s) {
        //TODO : regex for validating email
        return true;
    }
}
