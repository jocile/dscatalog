package com.jocile.dscatalog.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable {
  private static final long serialVersionUID = 1L;

  private Instant timestamp;
  private Integer status;
  private String error;
  private String message;
  private String path;

  public StandardError() {
  }

  public Instant getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(Instant timestamp) {
    this.timestamp = timestamp;
  }

  public Integer getStatus() {
    return this.status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getError() {
    return this.error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getPath() {
    return this.path;
  }

  public void setPath(String path) {
    this.path = path;
  }

}
