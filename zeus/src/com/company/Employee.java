package com.company;

public class Employee {

    private String name;
    private int code;
    private float hoursWorked, valueHourWorked;
    private Shift shift;
    private Position position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getValueHourWorked() {
        return valueHourWorked;
    }

    public void setValueHourWorked(float valueHourWorked) {
        this.valueHourWorked = valueHourWorked;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
