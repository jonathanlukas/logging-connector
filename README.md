# Log Template

A template to log a message to the connector CLI

## Build

```bash
mvn clean package
```

## API

### Input

```json
{
  "message": ".....",
  "loggerName": "....."
}
```

## Test locally

Run unit tests

```bash
mvn clean verify
```

Use the [Camunda Job Worker Connector Run-Time](https://github.com/camunda/connector-framework/tree/main/runtime-job-worker) to run your function as a local Job Worker.

## Element Template

The element templates can be found in the [element-templates](element-templates) folder.
