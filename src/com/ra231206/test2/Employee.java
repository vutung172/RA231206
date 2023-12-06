package com.ra231206.test2;

public class Employee {
    private String eCode;
    private String fullName;
    private float salary;
    private float workDay;

    public Employee(String eCode, String fullName, float salary, float workDay) {
        this.eCode = eCode;
        this.fullName = fullName;
        this.salary = salary;
        this.workDay = workDay;
    }

    public String geteCode() {
        return eCode;
    }

    public void seteCode(String eCode) {
        this.eCode = eCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getWorkDay() {
        return workDay;
    }

    public void setWorkDay(float workDay) {
        this.workDay = workDay;
    }

    public float calSalary(){
        return salary * workDay;
    }
}
