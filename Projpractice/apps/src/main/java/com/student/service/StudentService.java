package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.exception.StudentAlreadyExistsException;
import com.student.exception.StudentNotFoundException;

@Service
public interface StudentService {
	
	Student addStudent(Student student)throws StudentAlreadyExistsException;
	
	Student updateStudents(Student student);
	//Student updateStudents(Student student);

	 Student deleteStudent(Long studentId) ;
	 
	List<Student> fetchAllStudents();
	
	Optional<Student> fetchStudentById(Long studentId) throws StudentNotFoundException;

}
