package com.example.sqdemo.controller;



import com.example.sqdemo.exception.NotExistEmpException;
import com.example.sqdemo.model.domain.dto.DeptDTO;
import com.example.sqdemo.model.domain.dto.EmpDTO;
import com.example.sqdemo.model.entity.Dept;
import com.example.sqdemo.service.CompanyService;
import com.example.sqdemo.service.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //모든 메소드의 결과가 문자열로 반환, 비동기에 적합
public class CompanyController {

	@Autowired
	private CompanyServiceImpl service;
	
	//모든 부서 정보 검색
	@GetMapping("alldepts")
	public List<DeptDTO> getDeptAll(){
		return service.getDeptAll();
	}

	@GetMapping("/dept")
	public String getDeptById(@RequestParam Integer id) {
		Dept dept = service.findDeptById(id).get();
		return dept.getDname();
	}

	
	//emp이름으로 해당 사원 검색
	@GetMapping("empone")
	public EmpDTO getEmpEname(@RequestParam("ename") String ename) throws NotExistEmpException {
		return service.getEmp(ename);
	}
	
	@ExceptionHandler
	public String notDeptHander(NotExistEmpException e) {
		e.printStackTrace();
		return "해당 직원 정보 미존재";
	}
	
	//부서 번호로 해당 부서 직원 이름, 급여 검색
	@GetMapping("empall")
	public List<Object[]> getEmpsByDept(int deptno){
		return service.getEmpsbyDeptno(deptno); 
	}
	
	//사번과 새로운 부서 번호로 부서 이동
	@PostMapping("emp")
	public String updateEmpBydeptno(@RequestParam("empno") int empno, @RequestParam("newDeptno") int newDeptno) throws NotExistEmpException  {
		System.out.println("post");
		boolean result = service.updateDeptnoByEmpno(empno, newDeptno);
		if(result == true) {
			return "사원 부서 이동 성공";
		}else {
			return "사원 부서 이동 실패";
		}
	}
}









