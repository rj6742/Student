package com.Bikkadit.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bikkadit.Model.Student;
import com.Bikkadit.Repository.StudentRepo;

@Service
public class StudentImpl implements Servicei{
	
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student addStudent(Student student) {
		
		Student stu = studentRepo.save(student);
		
		return stu;
		
	}

	@Override
	public List<Student> getAll() {
		List<Student> Stu1 = studentRepo.findAll();
		return Stu1;
	}

	

	
	

}
