package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = (StudentDao) context.getBean("studentDao");
		/*
		 * Student student=new Student(113,"Sushruth","Hyderabad"); int
		 * r=studentDao.insert(student); System.out.println("Done "+r);
		 */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean go=true;
	while(go) {
		System.out.println("Press 1 to add new Student");
		System.out.println("Press 2 for display all students");
		System.out.println("Press 3 to get details of a single student");
		System.out.println("Press 4 to delete Student");
		System.out.println("Press 5 to update student");
		System.out.println("Press 6 to exit");
		try {
			int choice=Integer.parseInt(br.readLine());
			switch(choice) {
			case 1:
				//add a new student
				Student student=(Student) context.getBean("student");
				System.out.println("Enter student id:");
				int id=Integer.parseInt(br.readLine());
				student.setStudentId(id);
				System.out.println("Enter student name: ");
				student.setStudentName(br.readLine());
				System.out.println("Enter student City: ");
				student.setStudentCity(br.readLine());
				studentDao.insert(student);
				break;
			case 2:
				//display all student
				List<Student>students=studentDao.getAllStudents();
				for(Student s:students) {
					System.out.println(s);
				}
				break;
			case 3:
				//get single student data
				System.out.println("Enter the student id to get details:");
				Student s=studentDao.getStudent(Integer.parseInt(br.readLine()));
				System.out.println(s);
				break;
			case 4:
				//delete student
				System.out.println("Enter student id to delete:");
				studentDao.deleteStudent(Integer.parseInt(br.readLine()));
				break;
			case 5:
				//update student
				Student st=(Student) context.getBean("student");
				System.out.println("Enter id of student to update");
				st.setStudentId(Integer.parseInt(br.readLine()));
				System.out.println("Enter new name:");
				st.setStudentName(br.readLine());
				System.out.println("ENter new City :");
				st.setStudentCity(br.readLine());
				studentDao.updateStudent(st);
				break;
			case 6:
				//exit
				go=false;
				break;
			}
			
		}catch(Exception e) {
			System.out.println("Invalid input..");
			System.out.println(e.getMessage());
		}
		
		}
		
		

	}

}
