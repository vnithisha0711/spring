package com.student.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.student.entity.Student;
import com.student.exception.StudentAlreadyExistsException;
import com.student.exception.StudentNotFoundException;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	

	
       @Autowired
		private StudentRepository studentRepository;
       
//       @Autowired
//       private StudentService studentService;

		@Override
		public Student addStudent(Student student) throws StudentAlreadyExistsException {

			if (studentRepository.findById(student.getId()).isPresent()) {
				throw new StudentAlreadyExistsException("this" + student.getId() + "already exist");
			} else if (studentRepository.existsByEmail(student.getEmail()).isPresent()) {
				throw new StudentAlreadyExistsException("this" + student.getEmail() + "already exist");
			} else {
				return studentRepository.save(student);
			}

		}

		@Override
		public List<Student> fetchAllStudents() {
			return studentRepository.findAll();
		}

		@Override
		public Optional<Student> fetchStudentById(Long studentId) throws StudentNotFoundException {

			return Optional.of(studentRepository.findById(studentId)
					.orElseThrow(() -> new StudentNotFoundException("Student Does not Exist " + studentId)));

		}

		  @Override
		    public Student updateStudents(Student student) throws StudentNotFoundException {
		        Optional<Student> existingStudent = studentRepository.findById(student.getId());
		        if (existingStudent.isPresent()) {
		            Student updatedStudent = existingStudent.get();
		            updatedStudent.setName(student.getName());
		            updatedStudent.setEmail(student.getEmail());

		            return studentRepository.save(updatedStudent);
		        } else {
		            throw new StudentNotFoundException("Student with ID " + student.getId() + " not found");
		        }
		    }

		  @Override
		    public Student deleteStudent(Long studentId) throws StudentNotFoundException {
		        Student existingStudent = studentRepository.findById(studentId)
		                .orElseThrow(() -> new StudentNotFoundException("Student with ID " + studentId + " not found"));
		        studentRepository.delete(existingStudent);
		        return null;
		    }

		


		
	}

