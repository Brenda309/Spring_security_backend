package com.quiz.app.quizapp.email;

public interface EmailSender {
    void send(String to, String email) throws IllegalAccessException;
}
