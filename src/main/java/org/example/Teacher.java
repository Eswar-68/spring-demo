package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {

    public Teacher() {
        System.out.println("Teacher constructor");
    }

    //setter injector
    public void setWriter(Writer writer) {

        this.writer = writer;
    }

    protected Writer writer;



}
