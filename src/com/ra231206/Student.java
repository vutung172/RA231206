package com.ra231206;

public class Student extends Person{
    private String studentCode;
    public Student() {
    }


    public Student(String fullName, int age, boolean sex, String studentCode) {
        super(fullName, age, sex);
        this.studentCode = studentCode;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public void reLearn(){
        System.out.println("Mã SV"+studentCode+" đang học lại");
    }
}
