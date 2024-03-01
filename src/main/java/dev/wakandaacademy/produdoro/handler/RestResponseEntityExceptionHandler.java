package dev.wakandaacademy.produdoro.handler;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Log4j2
public class RestResponseEntityExceptionHandler {
    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ErrorApiResponse> handlerGenericException(ApiException apiException){
        return apiException.buildErrorResponseEntity();
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorApiResponse> handlerGenericException(Exception ex){
     log.error("Exception",ex);
     return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
             .body(ErrorApiResponse.builder()
                     .message("INTERNAL SERVER ERROR")
                     .Description("POR FAVOR, INFORME O ADMINISTRADOR DO SISTEMA")
                     .build());


    }
}
