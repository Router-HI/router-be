package org.router.apimodule.member.presentation;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.router.commonmodule.dto.member.request.SignInRequest;
import org.router.commonmodule.dto.member.request.SignUpRequest;
import org.router.commonmodule.common.CommonResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Member", description = "회원 관리 API")
@RestController
@RequestMapping("/api/v1/members")
@RequiredArgsConstructor
public class MemberController {

    @PostMapping("/sign-up")
    public CommonResponse<?> signUp(@Valid @RequestBody SignUpRequest signUpRequest) {
        return CommonResponse.ok();
    }

    @PostMapping("/sign-in")
    public CommonResponse<?> signIn(@Valid @RequestBody SignInRequest signInRequest) {
        return CommonResponse.ok();
    }
}
