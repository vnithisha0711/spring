package com.student;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.student.entity.Student;
import com.student.exception.StudentAlreadyExistsException;
import com.student.exception.StudentNotFoundException;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;
import com.student.service.serviceImpl.StudentServiceImpl;

@SpringBootTest
class AppsApplicationTests {
	
	@Mock
	private StudentRepository studentRepository;

 

    @InjectMocks
    private StudentServiceImpl studentService;

 

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

 

    @Test
    public void testAddStudent_Success() {
        Student student = new Student();
        student.setId(1L);
        student.setName("Test Student");
        student.setEmail("Test Student");

 

        when(studentRepository.findById(student.getId())).thenReturn(Optional.empty());
        when(studentRepository.save(student)).thenReturn(student);

        try {
            Student addedStudent = studentService.addStudent(student);
            assertEquals(student, addedStudent);
            verify(studentRepository, times(1)).findById(student.getId());
            verify(studentRepository, times(1)).save(student);
        } catch (StudentAlreadyExistsException e) {
            fail("Should not throw StudentAlreadyExistsException");
        }
    }

 

    @Test
    public void testAddStudent_AlreadyExists() {
        Student student = new Student();
        student.setId(1L);
        student.setName("Test Student");
        student.setEmail("Test Student");

 

        when(studentRepository.findById(student.getId())).thenReturn(Optional.of(student));

 

        assertThrows(StudentAlreadyExistsException.class, () -> studentService.addStudent(student));

        verify(studentRepository, times(1)).findById(student.getId());
        verify(studentRepository, never()).save(student);
    }

 

    @Test
    public void testGetAllStudent() {
        List<Student> studentList = new ArrayList<>();
       // studentList.add(new Student(1L, "Student 1", 50L));
       // studentList.add(new Student(2L, "Student 2", 30L));

 

        when(studentRepository.findAll()).thenReturn(studentList);

 

        List<Student> retrievedStudents = studentService.fetchAllStudents();
        assertEquals(studentList, retrievedStudents);
        verify(studentRepository, times(1)).findAll();
    }

    @Test
    public void testGetStudentById_Success() {
        Long studentId = 1L;
        String email = " ";
        Student student = new Student(studentId, "Test Student", email);

 

        when(studentRepository.findById(studentId)).thenReturn(Optional.of(student));

 

        try {
            Optional<Student> retrievedStudent = studentService.fetchStudentById(studentId);
            assertTrue(retrievedStudent.isPresent());
            assertEquals(student, retrievedStudent.get());
            verify(studentRepository, times(1)).findById(studentId);
        } catch (StudentNotFoundException e) {
            fail("Should not throw StudentNotFoundException");
        }
    }

    @Test
    public void testGetStudentById_NotFound() {
        Long studentId = 1L;

 

        when(studentRepository.findById(studentId)).thenReturn(Optional.empty());

 

        assertThrows(StudentNotFoundException.class, () -> studentService.fetchStudentById(studentId));
        verify(studentRepository, times(1)).findById(studentId);
    }



    @Test
    public void testDeleteStudent_Success() {
        Long studentId = 1L;
        String email = "";
        Student student = new Student(studentId, "Test Product", email);

 

        when(studentRepository.findById(studentId)).thenReturn(Optional.of(student));
        doNothing().when(studentRepository).delete(student);
        try {
        	assertTrue(studentService.deleteStudent(studentId));
            verify(studentRepository, times(1)).findById(studentId);
            verify(studentRepository, times(1)).delete(student);
        } catch (Exception e) {
            fail("Should not throw Exception");
        }
    }

 

    @Test
    public void testDeleteStudent_NotFound() {
        Long studentId = 1L;

 

        when(studentRepository.findById(studentId)).thenReturn(Optional.empty());


        assertThrows(Exception.class, () -> studentService.deleteStudent(studentId));
        verify(studentRepository, times(1)).findById(studentId);
        verify(studentRepository, never()).delete(any());
    }



private Student any() {
	// TODO Auto-generated method stub
	return null;
}


     
	
   
	 
}
