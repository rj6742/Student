package com.Bikkadit.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Bikkadit.Model.Student;
import com.Bikkadit.Service.StudentImpl;

@RestController
public class StudentController {

	@Autowired
	private StudentImpl studentImpl;
	
	@PostMapping(value="/saveStudent" , produces = "application/json" ,consumes = "application/json")
	public ResponseEntity<Student> savedata(@RequestBody Student student)
	{
		Student addStudent = studentImpl.addStudent(student);
	
		
		
		return new ResponseEntity<Student>(addStudent,HttpStatus.OK);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getAll()
	{
		
		
		List<Student> alldata = studentImpl.getAll();
		System.out.println(alldata);
		
		
		return new ResponseEntity<> ( alldata,HttpStatus.OK);
		
	}
	
	
	
}

