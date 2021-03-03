package byx.web.bookstore.advice;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.common.Status;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

@RestControllerAdvice
public class ControllerExceptionAdvice {
    private String getErrorMessage(BindException e) {
        return e.getBindingResult().getFieldError() != null ? e.getBindingResult().getFieldError().getDefaultMessage() : "";
    }

    @ExceptionHandler(BindException.class)
    public Result<?> parameterException(BindException e) {
        return Result.fail(Status.PARAMETER_ERROR, getErrorMessage(e));
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Result<?> requestException(HttpMessageNotReadableException e) {
        return Result.fail(Status.BAD_REQUEST);
    }

    @ExceptionHandler(SQLException.class)
    public Result<?> internalException(SQLException e) {
        return Result.fail(Status.INTERNAL_ERROR);
    }
}
