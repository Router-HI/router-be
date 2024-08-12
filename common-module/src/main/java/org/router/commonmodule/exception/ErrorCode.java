package org.router.commonmodule.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    // Success
    OK(1000, 200, "정상적으로 요청이 처리되었습니다."),
    CREATED(1001, 201, "자원이 생성되었습니다."),

    // Common Error
    INTERNAL_SERVER_ERROR(2000, 500, "서버 내부에서 오류가 발생했습니다."),


    // Domain Error
    // User
    USER_NOT_FOUND(3000, 401, "사용자 정보를 찾을 수 없습니다."),
    ALREADY_EXIST_USER(3001, 401,  "기 가입한 사용자입니다.");


    private final int code;
    private final int httpStatus;
    private final String message;
}