package org.example;

import java.sql.SQLOutput;

public class Pen implements Writer{

    public Pen(){
        System.out.println("Pen Constructor");
    }

    @Override
    public void write() {
        System.out.println("Pen");
    }
}
