package cz.jirutka.validator.spring;

import javax.validation.constraints.NotNull;

class FieldAssertedRequest {

  @NotNull
  @SpELAssert("#this != null")
  public String value;

}
