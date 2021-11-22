package edu.gosho.samplespringapp.domain.common;

public class ServerResponse {
    ResponseType responseType;
    Object response;

    public ServerResponse(ResponseType responseType, Object response) {
        this.responseType = responseType;
        this.response = response;
    }

    public ResponseType getResponseType() {
        return responseType;
    }

    public void setResponseType(ResponseType responseType) {
        this.responseType = responseType;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }
}
