package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parent {

    //Field Injection
    @Autowired
    private Writer writer;

    public void write(){
        System.out.print("Parent Writer: ");
        writer.write();
    }
}
