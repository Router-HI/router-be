package org.router.domainmodule.member.dto.request;


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
