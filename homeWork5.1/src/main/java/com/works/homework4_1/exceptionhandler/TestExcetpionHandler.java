package com.works.homework4_1.exceptionhandler;

import com.works.homework4_1.dto.ErrorResponse;
import com.works.homework4_1.exception.ProgramLanguageAlreadyExistException;
import com.works.homework4_1.exception.ProgramLanguageNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TestExcetpionHandler {

    @ExceptionHandler(ProgramLanguageAlreadyExistException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handleCustomerNotFoundException(ProgramLanguageAlreadyExistException customerNotFoundException) {
        ErrorResponse ex = new ErrorResponse(customerNotFoundException.getMessage(), "401");
        return new ResponseEntity<>(ex, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(ProgramLanguageNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> programLanguageNotFoundException(ProgramLanguageNotFoundException programLanguageNotFoundException) {
        ErrorResponse ex = new ErrorResponse(programLanguageNotFoundException.getMessage(), "401");
        return new ResponseEntity<>(ex, HttpStatus.NOT_FOUND);
    }


}
/*
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse> handleCustomerNotFoundException(CustomerNotFoundException customerNotFoundException){
        ErrorResponse ex = new ErrorResponse(customerNotFoundException.getMessage(), "404");
        return new ResponseEntity<>(ex, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(TransactionNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse> handleTransactionNotFoundException(TransactionNotFoundException transactionNotFoundException){
        ErrorResponse ex = new ErrorResponse(transactionNotFoundException.getMessage(), "404");
        return new ResponseEntity<>(ex, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(OutOfRangeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handleOutOfRangeException(OutOfRangeException outOfRangeException){
        ErrorResponse ex = new ErrorResponse(outOfRangeException.getMessage(), "400");
        return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(OtherCurrencyException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handleOtherCurrencyException(OtherCurrencyException e){
        ErrorResponse ex = new ErrorResponse(e.getMessage(), "400");
        return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(RequestFieldIsNullException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handleRequestFieldIsNullException(RequestFieldIsNullException requestFieldIsNullException){
        ErrorResponse ex = new ErrorResponse(requestFieldIsNullException.getMessage(), "400");
        return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(UnknownException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ErrorResponse> handleUnknownException(UnknownException unknownException){
        ErrorResponse ex = new ErrorResponse("Bilinmeyen sebebden dolayi xeta bas verdi !", "500");
        return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(DuplicateTransactionIdException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<ErrorResponse> handleDuplicateTransactionIdException(DuplicateTransactionIdException duplicateTransactionIdException){
        ErrorResponse ex = new ErrorResponse(duplicateTransactionIdException.getMessage(), "409");
        return new ResponseEntity<>(ex, HttpStatus.CONFLICT);
    }


}
 */
