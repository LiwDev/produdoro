package dev.wakandaacademy.produdoro.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Getter
@Log4j2
public class ApiException extends  RuntimeException{

    private HttpStatus status;
    private ErrorApiResponse errorApiResponse;

    public ApiException(HttpStatus status, ErrorApiResponse errorApiResponse) {
        this.status = status;
        this.errorApiResponse = errorApiResponse;
    }

    public ApiException(String message, HttpStatus status, Exception ex) {
        super(message,ex);
        this.status = status;
        this.errorApiResponse = ErrorApiResponse.builder()
                .message(message)
                .Description(getDescription(ex))
                .build();
    }

    private String getDescription(Exception ex) {
        return Optional.ofNullable(ex).map(ApiException::getMessageCause).orElse(null);
    }
    public static ApiException build(HttpStatus status,String message){
        return new ApiException(message,status,null);

    }
    public static ApiException build(HttpStatus status,String message,Exception ex){
        log.error("Exception: ",ex);
        return new ApiException(message,status,ex);

    }

    private static String getMessageCause(Exception e) {
        return e.getCause() != null ? e.getCause().getMessage() : e.getMessage();
    }

    public ApiException(String message, Throwable cause, HttpStatus status, ErrorApiResponse errorApiResponse) {
        super(message, cause);
        this.status = status;
        this.errorApiResponse = errorApiResponse;
    }

    public ApiException(Throwable cause, HttpStatus status, ErrorApiResponse errorApiResponse) {
        super(cause);
        this.status = status;
        this.errorApiResponse = errorApiResponse;
    }
    

    public ResponseEntity<ErrorApiResponse> buildErrorResponseEntity() {
        return  ResponseEntity.status(status).body(errorApiResponse);
    }
}
