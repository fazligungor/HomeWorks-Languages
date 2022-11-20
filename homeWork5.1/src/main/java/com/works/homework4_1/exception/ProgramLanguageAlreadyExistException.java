package com.works.homework4_1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Language available!")
public class ProgramLanguageAlreadyExistException extends RuntimeException {
    public ProgramLanguageAlreadyExistException() {
        super("Language available");
    }
}

/*
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Card nomresine aid musteri tapilmadi !")
public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException() {
        super("Card nomresine aid musteri tapilmadi !");
    }

    public CustomerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
 */