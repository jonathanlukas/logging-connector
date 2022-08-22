package io.camunda.connector;

import io.camunda.connector.api.Validator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MyRequestTest {


  @Test
  void shouldFailWhenValidate_NoLoggerName() {
    // given
    var input = new LogInput();
    input.setMessage("Hello World!");
    var validator = new Validator();
    input.validateWith(validator);
    // when
    assertThatThrownBy(validator::evaluate)
      // then
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessageContaining("loggerName");
  }

  @Test
  void shouldFailWhenValidate_NoMesage() {
    // given
    var input = new LogInput();
    input.setLoggerName("Hello World Logger");
    var validator = new Validator();
    input.validateWith(validator);
    // when
    assertThatThrownBy(validator::evaluate)
      // then
      .isInstanceOf(IllegalArgumentException.class)
      .hasMessageContaining("message");
  }
}