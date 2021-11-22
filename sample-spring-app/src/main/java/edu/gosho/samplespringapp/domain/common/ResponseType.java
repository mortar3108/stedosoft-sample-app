package edu.gosho.samplespringapp.domain.common;

public enum ResponseType {
    SUCCESS("success"),
    ERROR("error");

    private final String text;

    ResponseType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
