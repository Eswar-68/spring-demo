package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        ApplicationContext context1 =new AnnotationConfigApplicationContext("org.example.config");
        // (or) ApplicationContext context1 =new AnnotationConfigApplicationContext(JavaSpringConfig.class);

        //manual dependency injection
        Student student = context.getBean("student", Student.class);
        Student student1 = context.getBean("student1", Student.class);
        Student student2 = context1.getBean("student", Student.class);
        Teacher teacher = context.getBean("teacher", Teacher.class);
        Teacher teacher1 = context1.getBean("teacher", Teacher.class);
        HOD hod = context.getBean("hod", HOD.class);
        Parent parent = context1.getBean("parent", Parent.class);

        System.out.print("Student Writer: ");
        student.writer.write();

        System.out.print("Student1 writer :");
        student1.writer.write();

        System.out.print("Student2 writer :");
        student2.writer.write();

        System.out.print("Teacher writer :");
        teacher.writer.write();

        System.out.print("Teacher1 writer :");
        teacher1.writer.write();

        System.out.print("HOD writer :");
        hod.writer.write();

        parent.write();
    }
}
