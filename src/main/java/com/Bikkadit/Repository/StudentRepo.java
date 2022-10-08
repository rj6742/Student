package com.Bikkadit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bikkadit.Model.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
}
