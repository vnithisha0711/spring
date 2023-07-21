//package com.cg.employees.exceptions;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import com.cg.employees.controller.EmployeeController;
//import com.cg.employees.dto.EmployeeDTO;
//import com.cg.employees.service.EmployeeService;
//import com.cg.employees.testutils.MasterData;
//
//@WebMvcTest(EmployeeController.class)
//@AutoConfigureMockMvc
//class EmployeeExceptionTest {
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@MockBean
//	private EmployeeService employeeService;
//
//	@Test
//	public void testSaveEmployeeInvalidDataException() throws Exception{
//		EmployeeDTO employeeDTO=MasterData.getEmployeeDTO();
//		EmployeeDTO savedemployeeDTO=MasterData.getEmployeeDTO();
//		employeeDTO.setAge(12);
//		when(this.employeeService.saveEmployee(employeeDTO)).thenReturn(savedemployeeDTO);
//		RequestBuilder requestBuilder=MockMvcRequestBuilders.post("/api/employees").content(MasterData.asJsonString(employeeDTO)).contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);
//		MvcResult result=mockMvc.perform(requestBuilder).andReturn();
//
//		assertEquals(true, result.getResponse().getStatus()==HttpStatus.BAD_REQUEST.value() ? true : false);
//
//	}
//
//}
//
