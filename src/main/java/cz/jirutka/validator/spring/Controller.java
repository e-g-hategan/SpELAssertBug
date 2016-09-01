package cz.jirutka.validator.spring;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.*;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class Controller {

  @RequestMapping(method = POST, value = "/field")
  @ResponseStatus(OK)
  public void field(
      @Valid @RequestBody FieldAssertedRequest payload
  ) {
  }

  @RequestMapping(method = POST, value = "/type")
  @ResponseStatus(OK)
  public void type(
      @Valid @RequestBody TypeAssertedRequest payload
  ) {
  }
}
