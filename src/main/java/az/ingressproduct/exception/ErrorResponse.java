package az.ingressproduct.exception;

import lombok.Builder;

@Builder
public record ErrorResponse(String message) {
}
