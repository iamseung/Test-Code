package sample.cafekiosk.spring.api;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiControllerAdvice {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BindException.class) // BindException -> Valid Error Catch
    public ApiResponse<Object> bindException(BindException e) {
        ObjectError data = e.getBindingResult().getAllErrors().get(0);
        return ApiResponse.of(
                HttpStatus.BAD_REQUEST,
                data.getDefaultMessage(),
                null
        );
    }

}
