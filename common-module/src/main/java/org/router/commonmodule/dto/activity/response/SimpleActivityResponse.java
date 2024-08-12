package org.router.commonmodule.dto.activity.response;

import lombok.Builder;

@Builder
public record SimpleActivityResponse(

        Long id,

        String title
) {
}
