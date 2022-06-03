package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

@Configuration
@ComponentScan(basePackages= {"com.spring.jdbc.dao"})
public class JdbcConfig {
	
	@Bean(name="student")
	public Student getStudent() {
		Student student=new Student();
		return student;
	}
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Tada@5454");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
		
	}
	
	/*
	 * @Bean("studentDao") public StudentDaoImpl getStudentDao() { StudentDaoImpl
	 * sd=new StudentDaoImpl(); sd.setJdbcTemplate(getJdbcTemplate()); return sd;
	 * 
	 * }
	 */
	

}
