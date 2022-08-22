package io.camunda.connector;

import io.camunda.connector.api.ConnectorInput;
import io.camunda.connector.api.SecretStore;
import io.camunda.connector.api.Validator;

import java.util.Objects;

public class LogInput implements ConnectorInput {

  private String message;
  private String loggerName;

  @Override
  public void validateWith(final Validator validator) {
    validator.require(message, "message");
    validator.require(loggerName, "loggerName");
  }

  @Override
  public void replaceSecrets(final SecretStore secretStore) {}

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getLoggerName() {
    return loggerName;
  }

  public void setLoggerName(String loggerName) {
    this.loggerName = loggerName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {return true;}
    if (o == null || getClass() != o.getClass()) {return false;}
    LogInput logInput = (LogInput) o;
    return Objects.equals(message, logInput.message) && Objects.equals(loggerName, logInput.loggerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, loggerName);
  }

  @Override
  public String toString() {
    return "LogInput{" + "message='" + message + '\'' + ", loggerName='" + loggerName + '\'' + '}';
  }
}
