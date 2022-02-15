package com.shashank.sudent.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shashank.sudent.dal.Entities.Student;
import com.shashank.sudent.dal.repos.*;
@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {  //create
		Student student = new Student();
		student.setName("Shashank");
		student.setCourse("Java SpringBoot");
		student.setFee(150d);
		studentRepository.save(student);
	}
	
	@Test
	public void testFindStudent() {   //Read
	Optional<Student> student = studentRepository.findById(1l);
	System.out.println(student);
	}
	
	@Test
	public void testFindStudent() {   //Read
	Student student = studentRepository.findById(1l);
	student.setFee(100d);
	studentRepository.save(student);
	}
	
	
	@Test
	public void testDeleteStudent() {   //delete
		studentRepository.deleteById(2l);
	}
	
}
