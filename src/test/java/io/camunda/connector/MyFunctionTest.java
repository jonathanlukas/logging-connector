package io.camunda.connector;

import static org.assertj.core.api.Assertions.assertThat;

import io.camunda.connector.test.ConnectorContextBuilder;
import org.junit.jupiter.api.Test;

public class MyFunctionTest {

  @Test
  void shouldReturnReceivedMessageWhenExecute() {
    // given
    var input = new LogInput();
    input.setMessage("Hello World!");
    input.setLoggerName("Hello World Logger");
    var function = new LogFunction();
    var context = ConnectorContextBuilder.create()
      .variables(input)
      .build();
    // when
    var result = function.execute(context);
    // then
    assertThat(result).isNull();
  }
}