package com.ra231206.test;

public class Program {
    public static void main(String[] args) {
        Person person = new Person("Tùng","Japan");
        Student student = new Student("Tùng","Japan","RA03",2023,135);
        Staff staff = new Staff("Tung","Japan","Rikkei",140);
        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);

    }
}
