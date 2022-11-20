package com.works.homework4_1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Language is not available!")
public class ProgramLanguageNotFoundException extends RuntimeException {
    public ProgramLanguageNotFoundException() {
        super("Language is not available");
    }
}

