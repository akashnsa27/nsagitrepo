package com.nsa.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ApplicationExceptionHandler {


//    @ExceptionHandler(NotFoundException.class)
//    public ResponseEntity<ApiResponse> handleNotFoundException(NotFoundException e) {
//        ApiResponse response = new ApiResponse();
//        response.setTime(LocalDateTime.now());
//        response.setErrorMsg(e.getMessage());
//        response.setDetails(e.getErrorDescritpion());
//        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
//    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ApiResponse> handleIllegalArgumentException(IllegalArgumentException e) {
        ApiResponse response = new ApiResponse();
        response.setTime(LocalDateTime.now());
        response.setErrorMsg(e.getMessage());
        response.setDetails(e.getLocalizedMessage());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

//    @ExceptionHandler(NotFoundException.class)
//    public ResponseEntity<Object> handleNotFoundException2(NotFoundException e){
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
//    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleNotFoundException3(NotFoundException e, WebRequest request){
        Map<String, Object> errordetails = new HashMap<>();

        errordetails.put("time", LocalDateTime.now());
        errordetails.put("errorMsg", e.getMessage());
        errordetails.put("requestPath", request.getDescription(false));

        return new ResponseEntity<>(errordetails, HttpStatus.NOT_FOUND);
    }


}
