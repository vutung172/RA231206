package com.ra231206.test2;

public class Teacher extends Employee{
    private float ptSalary;
    private float ptWorkDay;

    public Teacher(String eCode, String fullName, float salary, float workDay, float ptSalary, float ptWorkDay) {
        super(eCode, fullName, salary, workDay);
        this.ptSalary = ptSalary;
        this.ptWorkDay = ptWorkDay;
    }

    public float getPtSalary() {
        return ptSalary;
    }

    public void setPtSalary(float ptSalary) {
        this.ptSalary = ptSalary;
    }

    public float getPtWorkDay() {
        return ptWorkDay;
    }

    public void setPtWorkDay(float ptWorkDay) {
        this.ptWorkDay = ptWorkDay;
    }

    @Override
    public float calSalary() {
        return super.calSalary()+(ptSalary*ptWorkDay);
    }


}
