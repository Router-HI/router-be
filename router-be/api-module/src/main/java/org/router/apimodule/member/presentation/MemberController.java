package org.router.apimodule.member.presentation;

import org.router.commonmodule.common.CommonResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @PostMapping("/sign-up")
    public CommonResponse<?> signUp() {
        return CommonResponse.ok();
    }
}
