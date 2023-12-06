package com.ra231206.test2;

public class Test2 {
    public static void main(String[] args) {
        Employee teacher = new Teacher("MS01","Vũ Thanh Tùng", 10,21,15,15);
        System.out.println("Nhân viên: "+teacher.getFullName()+" mang mã số: "+teacher.geteCode()+" có tổng lương là: "+teacher.calSalary());
    }
}
