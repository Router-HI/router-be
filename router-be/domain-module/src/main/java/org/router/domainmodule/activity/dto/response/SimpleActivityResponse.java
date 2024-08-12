package org.router.domainmodule.activity.dto.response;

import lombok.Builder;

@Builder
public record SimpleActivityResponse(

        Long id,

        String title
) {
}
