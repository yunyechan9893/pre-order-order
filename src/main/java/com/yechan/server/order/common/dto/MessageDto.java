package com.yechan.server.order.common.dto;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

@Builder
public record MessageDto(
    String message,
    @JsonInclude(NON_EMPTY)
    Boolean isValid
) {

}

