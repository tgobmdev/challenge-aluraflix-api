package tgobmdev.challengealuraflixapi.error.exception;

import java.io.Serial;
import lombok.Getter;
import tgobmdev.challengealuraflixapi.error.model.ApiErrorResponse;

@Getter
public class ApiException extends RuntimeException {

  @Serial
  private static final long serialVersionUID = -4283381744857865643L;

  private final ApiErrorResponse apiErrorResponse;

  public ApiException(int code, String message) {
    this.apiErrorResponse = new ApiErrorResponse(code, message);
  }
}