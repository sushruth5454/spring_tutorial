package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	ApplicationContext context2=new AnnotationConfigApplicationContext(JdbcConfig.class);
		/*
		 * JdbcTemplate template=(JdbcTemplate) context.getBean("jdbcTemplate");
		 * 
		 * //insert query String
		 * query="insert into student(id,name,city) values(?,?,?)";
		 * 
		 * //fire the query int result=template.update(query, 115,"phani","micili");
		 */    	
    	
    	Student student=context2.getBean("student",Student.class);
    	/*System.out.println("enter id");*/
		/*//insert
		 * student.setId(117); student.setName("vinod"); student.setCity("devarkonda");
		 * 
		 * StudentDao sd=(StudentDao) context.getBean("studentDao"); int
		 * r=sd.insert(student); System.out.println("number of records inserted.."+r);
		 */
		/*//update
		 * student.setId(117); student.setName("ramya"); student.setCity("srd");
		 * 
		 * StudentDao sd=(StudentDao) context.getBean("studentDao"); int
		 * r=sd.change(student); System.out.println("number of records updated.."+r);
		 */
    	
		/*//delete
		 * student.setId(115);
		 */
		  StudentDao sd=(StudentDao) context2.getBean("studentDao");
		 /* r=sd.delete(student); System.out.println("number of records deleted.."+r);
		 */
    	
    	//select
    	
		/*
		 * Student s1=sd.getStudent(117); System.out.println(s1);
		 */
		  
		 List<Student>students=sd.geAllStudents();
		 for(Student s:students) {
			 System.out.println(s);
		 }
		  
    	
    }
}
