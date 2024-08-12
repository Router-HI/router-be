package org.router.apimodule.member.application;

import lombok.RequiredArgsConstructor;
import org.router.domainmodule.member.dto.request.SignUpRequest;
import org.router.domainmodule.member.dto.response.SignUpResponse;
import org.router.domainmodule.member.service.MemberService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberFacade {

    private final MemberService memberService;

    public SignUpResponse signUp(SignUpRequest signUpRequest) {
        memberService.signUp();
    }
}
