package org.router.commonmodule.enumerate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MemberRole {

    ROLE_GENERAL("일반"),
    ROLE_ADMIN("관리자");

    private final String koreanName;
}
