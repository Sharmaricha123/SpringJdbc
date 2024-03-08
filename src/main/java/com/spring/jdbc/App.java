package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        
//       ------- inserting--------
        
//        Student student=new Student();
//        student.setId(667);
//        student.setName("Ritik");
//        
//        int result=studentDao.insert(student);
//        System.out.println(result);
        
//        --------updating---------
        
//        Student student=new Student();
//        student.setId(666);
//        student.setName("Ritik Sharma");
//         int result=studentDao.change(student);
//         System.out.println(result);
       
        
//        ---------delete--------
        
//        int result=studentDao.delete(11);
//        System.out.println(result);
        
//        -----------selecting single data--------------
        
//        Student student=studentDao.getStudent(666);
//        System.out.println(student);
//        
        
//        -------------selecting all data ---------------------
        List<Student> studnets=studentDao.getAllStudents();
        for(Student s:studnets)
        {
        	System.out.println(s);
        }
        
    }
}
