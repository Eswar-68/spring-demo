package org.example.config;

import org.example.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan ("org.example")
public class JavaSpringConfig{

    @Bean
    public Student student(){
        return new Student(pencil(), 22, "Eswara Pandiayn");
    }

    @Bean
    //Qualifier takes precedence over primary
    public Teacher teacher(@Qualifier("pencil") Writer writer){
        Teacher teacher = new Teacher();
        teacher.setWriter(writer);
        return teacher;
    }

    @Bean
    @Primary
    public Pen pen(){
        return new Pen();
    }

    @Bean()
    public Pencil pencil(){
        return new Pencil();
    }

}