package com.javastart.springbeans.service;

public class JavaConfigService {

    private final String timeOfInitialization;
    private Integer dayOfMonth;

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public JavaConfigService(String timeOfInitialization) {
        this.timeOfInitialization = timeOfInitialization;
    }

    public String hello() {
        return "Hello from Java config," + " time: " + timeOfInitialization + ", day of month: " + dayOfMonth;
    }
}
