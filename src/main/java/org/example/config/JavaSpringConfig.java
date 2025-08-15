import package org.example;

import org.example.Pen;
import org.example.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaSpringConfig{

    @Bean
    public Student student(){
        return new Student(pen(), "22", "Eswara Pandiayn");
    }

    @Bean
    public Pen pen(){
        return new Pen();
    }

}