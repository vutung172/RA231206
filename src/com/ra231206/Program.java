package com.ra231206;

public class Program {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFullName("Hang Tran");
        person.setAge(18);
        person.setSex(false);

        person.hello();

        //khởi tạo student
        Student student = new Student();
        student.setFullName("Tùng Vũ");
        student.setAge(20);
        student.setSex(true);


    }
}
