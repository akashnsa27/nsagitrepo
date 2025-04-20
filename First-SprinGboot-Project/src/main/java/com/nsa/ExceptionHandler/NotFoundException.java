package com.nsa.ExceptionHandler;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NotFoundException extends RuntimeException {

    private String errorDescritpion;

    public NotFoundException(String errorDescritpion) {
//        this.errorDescritpion = errorDescritpion;
        super(errorDescritpion);   //for getMessage();
    }


}
