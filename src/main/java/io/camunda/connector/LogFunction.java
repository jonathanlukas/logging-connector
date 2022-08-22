package io.camunda.connector;

import io.camunda.connector.api.ConnectorContext;
import io.camunda.connector.api.ConnectorFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFunction implements ConnectorFunction {

  @Override
  public Object execute(ConnectorContext context) {
    var connectorRequest = context.getVariablesAsType(LogInput.class);

    context.validate(connectorRequest);
    context.replaceSecrets(connectorRequest);

    Logger log = LoggerFactory.getLogger(connectorRequest.getLoggerName());
    log.info(connectorRequest.getMessage());
    return null;
  }

}
