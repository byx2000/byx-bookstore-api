package byx.web.bookstore.advice;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.common.Status;
import byx.web.bookstore.exception.BizException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理
 *
 * @author byx
 */
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
        e.printStackTrace();
        return Result.fail(Status.BAD_REQUEST);
    }

    @ExceptionHandler(BizException.class)
    public Result<?> bizException(BizException e) {
        e.printStackTrace();
        return Result.fail(e.getStatus(), e.getData());
    }

    @ExceptionHandler(Exception.class)
    public Result<?> internalException(Exception e) {
        e.printStackTrace();
        return Result.fail(Status.INTERNAL_ERROR);
    }
}
