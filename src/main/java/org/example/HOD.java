package org.example;

public class HOD {

    public HOD() {
        System.out.println("HOD Constructor");
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    protected Writer writer;
}
