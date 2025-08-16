package org.example;

public class Student {

    protected Writer writer;
    private int age;
    private String name;

    public String getDetails(){
        return name+":"+age;
    }

    //constructor injector
    public Student(Writer writer, int age, String name){
        this.writer=writer;
        this.age=age;
        this.name=name;
    }

    public Student() {
        System.out.println("Student constructor");
    }
}
