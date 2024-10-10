package com.devoteam.ecommerce.exception.shared;

import java.util.Date;

public class ErrorMessage {
    private String message;
    private Date timestamp;
    private Integer code;

    private ErrorMessage(Builder builder) {
        this.message = builder.message;
        this.timestamp = builder.timestamp;
        this.code = builder.code;
    }

   
    public String getMessage() {
        return message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public Integer getCode() {
        return code;
    }

  
    public static class Builder {
        private String message;
        private Date timestamp;
        private Integer code;

      
        public Builder message(String message) {
            this.message = message;
            return this; 
        }

        
        public Builder timestamp(Date timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        public ErrorMessage build() {
            return new ErrorMessage(this);
        }
    }
}
