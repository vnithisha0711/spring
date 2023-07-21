//package com.cg.employees.boundary;
//
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.util.Set;
//
//import javax.validation.ConstraintViolation;
//import javax.validation.Validation;
//import javax.validation.Validator;
//import javax.validation.ValidatorFactory;
//
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.cg.employees.dto.EmployeeDTO;
//import com.cg.employees.testutils.MasterData;
//
//@SpringBootTest
//class EmployeeBoundaryTest {
//
//	private static Validator validator;
//	
//	@BeforeAll
//	public static void setUp() {
//		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
//		validator=factory.getValidator();
//	}
//	
//	@Test
//	void testEmployeeUsernameNotNull() throws Exception {
//		EmployeeDTO employeeDTO=MasterData.getEmployeeDTO();
//		employeeDTO.setUsername("");
//		Set<ConstraintViolation<EmployeeDTO>> violations=validator.validate(employeeDTO);
//		assertEquals(true, !violations.isEmpty()? true:false);
//	}
//	
//	@Test
//	void testEmployeePasswordNotNull() throws Exception {
//		EmployeeDTO employeeDTO=MasterData.getEmployeeDTO();
//		employeeDTO.setPassword("");
//		Set<ConstraintViolation<EmployeeDTO>> violations=validator.validate(employeeDTO);
//		assertEquals(true, !violations.isEmpty()? true:false);
//	}
//	
//	@Test
//	void testEmployeePasswordLengthMinFive() throws Exception {
//		EmployeeDTO employeeDTO=MasterData.getEmployeeDTO();
//		employeeDTO.setPassword("abc");
//		Set<ConstraintViolation<EmployeeDTO>> violations=validator.validate(employeeDTO);
//		assertEquals(true, !violations.isEmpty()? true:false);
//	}
//
//	@Test
//	void testEmployeePasswordLengthMaxFifteen() throws Exception {
//		EmployeeDTO employeeDTO=MasterData.getEmployeeDTO();
//		String password="";
//		for(int i=0;i<120;i++) {
//			password.concat("A");
//		}
//		employeeDTO.setPassword(password);
//		Set<ConstraintViolation<EmployeeDTO>> violations=validator.validate(employeeDTO);
//		assertEquals(true, !violations.isEmpty()? true:false);
//	}
//	
//}
