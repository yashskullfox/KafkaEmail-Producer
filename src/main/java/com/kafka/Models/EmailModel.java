package com.kafka.Models;

public class EmailModel {
    private String message;
    private String accountNumber;
    private String name;

    public EmailModel(String message, String accountNumber, String name) {
        this.message = message;
        this.accountNumber = accountNumber;
        this.name = name;
    }
}
