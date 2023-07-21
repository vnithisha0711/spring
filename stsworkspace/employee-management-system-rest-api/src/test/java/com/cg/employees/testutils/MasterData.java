//package com.cg.employees.testutils;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.boot.test.json.JsonContent;
//
//import com.cg.employees.dto.EmployeeDTO;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class MasterData {
//	
//	public static EmployeeDTO getEmployeeDTO() {
//		EmployeeDTO dto=new EmployeeDTO();
//		dto.setId(1);
//		dto.setAddress("Banglore");
//		dto.setAge(25);
//		dto.setDepartment("management");
//		dto.setName("Admin");
//		dto.setPassword("admin@123");
//		dto.setPhone(7654897654L);
//		dto.setSalary(87000);
//		return dto;
//				
//	}
//
//	public static List<EmployeeDTO> getEmployeeDTOList(){
//	    List<EmployeeDTO> list=new ArrayList<>();
//		EmployeeDTO dto=new EmployeeDTO();
//		dto.setId(1);
//		dto.setAddress("Banglore");
//		dto.setAge(25);
//		dto.setDepartment("management");
//		dto.setName("Admin");
//		dto.setPassword("admin@123");
//		dto.setPhone(7654897654L);
//		dto.setSalary(87000);
//		list.add(dto);
//		dto=new EmployeeDTO();
//		dto.setId(2);
//		dto.setAddress("Pune");
//		dto.setAge(25);
//		dto.setDepartment("IT");
//		dto.setName("Admin");
//		dto.setPassword("dba@123");
//		dto.setPhone(7654897654L);
//		dto.setSalary(87000);
//		list.add(dto);
//		return list;
//	}
//	
//	public static String asJsonString(final Object obj) {
//		try {
//			final ObjectMapper mapper=new ObjectMapper();
//			final String jsonContent=mapper.writeValueAsString(obj);
//			return jsonContent;
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			throw new RuntimeException();
//		}
//	}
//}
