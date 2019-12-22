package com.skson.wocao;

public class Resp {
    private String statusCodeValue;
    private String statusCode;
    private RespAuth body;

    public String getStatusCodeValue() {
        return statusCodeValue;
    }

    public void setStatusCodeValue(String statusCodeValue) {
        this.statusCodeValue = statusCodeValue;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public RespAuth getBody() {
        return body;
    }

    public void setBody(RespAuth body) {
        this.body = body;
    }
}
