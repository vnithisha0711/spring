package com.student.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.exception.StudentAlreadyExistsException;
import com.student.exception.StudentNotFoundException;
import com.student.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
    private  StudentService studentService; 
	
	@PostMapping("/addStudents")
	public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student)
			throws StudentAlreadyExistsException {
		Student s1 = studentService.addStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(s1);
	}
	

    @GetMapping("/fetch/allStudents")
    public ResponseEntity<List<Student>> fetchAllStudents() {
        List<Student> students = studentService.fetchAllStudents();
        return ResponseEntity.ok(students);
    }
    
    @GetMapping("/fetch/{id}")
    public ResponseEntity<Optional<Student>> fetchStudentById(@PathVariable("id") Long studentId)
            throws StudentNotFoundException {
        Optional<Student> student = studentService.fetchStudentById(studentId);
        return ResponseEntity.status(HttpStatus.OK).body(student);
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student)
            throws StudentNotFoundException {
        Student updatedStudent = studentService.updateStudents(student);
        return ResponseEntity.ok(updatedStudent);
    }
    
//    @PutMapping("/updateStudents")
//	public ResponseEntity<Student> updateStudents(@RequestBody Student student){
//		return new ResponseEntity<Student>(studentService.updateStudents(student), HttpStatus.ACCEPTED);
//		
//	}
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable("id") Long studentId)
            throws StudentNotFoundException {
        Student isDeleted = studentService.deleteStudent(studentId);
        return ResponseEntity.ok(isDeleted);
    }

 

    
}
