package org.router.commonmodule.dto.member.request;


import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;

@Builder
public record SignInRequest(
        @NotEmpty
        String email,

        @NotEmpty
        String password
) {
}
