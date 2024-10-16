package com.example.demo.exception;

import com.example.demo.dto.response.ResponseData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(AppException.class)
    ResponseEntity<ResponseData<?>> handleAppException(AppException e) {
        ErrorCode errorCode = e.getErrorCode();

        ResponseData<?> responseData = new ResponseData<>();
        responseData.setCode(errorCode.getCode());
        responseData.setMessage(errorCode.getMessage());

        return ResponseEntity.status(errorCode.getHttpStatus()).body(responseData);
    }
}
