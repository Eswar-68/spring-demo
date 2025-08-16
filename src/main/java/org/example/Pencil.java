package org.example;

public class Pencil implements Writer{
    public Pencil() {
        System.out.println("Pencil constructor");
    }

    @Override
    public void write(){
        System.out.println("Pencil");
    }
}
