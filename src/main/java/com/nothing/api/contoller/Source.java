package com.nothing.api.contoller;

public class Source
{
    @Override
    public String toString() {
        return "Source{" +
                "message='" + message + '\'' +
                '}';
    }

    private String message;

    public Source(String message)
    {
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
