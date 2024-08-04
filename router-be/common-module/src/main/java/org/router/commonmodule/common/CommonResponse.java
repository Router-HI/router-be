package org.router.commonmodule.common;

import lombok.Builder;
import org.router.commonmodule.exception.ErrorCode;

import java.time.LocalDateTime;

@Builder
public record CommonResponse<T>(
        LocalDateTime timestamp,
        Integer code,
        String message,
        T data
) {

    public static <T> CommonResponse<T> ok(T data) {
        return CommonResponse.<T>builder()
                .timestamp(LocalDateTime.now())
                .code(ErrorCode.OK.getCode())
                .message(ErrorCode.OK.getMessage())
                .data(data)
                .build();
    }

    public static <T> CommonResponse<T> ok() {
        return CommonResponse.<T>builder()
                .timestamp(LocalDateTime.now())
                .code(ErrorCode.OK.getCode())
                .message(ErrorCode.OK.getMessage())
                .build();
    }

    public static <T> CommonResponse<T> created(T data) {
        return CommonResponse.<T>builder()
                .timestamp(LocalDateTime.now())
                .code(ErrorCode.OK.getCode())
                .message(ErrorCode.OK.getMessage())
                .data(data)
                .build();
    }
}