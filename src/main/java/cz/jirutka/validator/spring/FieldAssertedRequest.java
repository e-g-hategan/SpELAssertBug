package cz.jirutka.validator.spring;

class FieldAssertedRequest {

  @SpELAssert("#this != null")
  public String value;

}
