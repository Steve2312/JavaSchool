package wk5.oefeningen;

public class Oefeninen {
    public static void main(String[] args) {
        Utils util = new Utils();
        Student student1 = new Student("s1010101", "Roland");
        student1.setCijfer(util.berekenCijfer());
        System.out.println(student1.getCijfer());
    }
}
