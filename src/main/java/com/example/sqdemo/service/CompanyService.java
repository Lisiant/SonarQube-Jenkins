package com.example.sqdemo.service;


import com.example.sqdemo.exception.NotExistEmpException;
import com.example.sqdemo.model.domain.dto.DeptDTO;
import com.example.sqdemo.model.domain.dto.EmpDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {
	
	//사원명으로 해당 사원 모든 정보 검색
	public EmpDTO getEmp(String ename) throws NotExistEmpException;
		
	//부서번호로 해당 부서에 소속된 모든 직원의 이름, 급여만 검색
	public List<Object[]> getEmpsbyDeptno(int deptno);
	
	//사번을 기준으로 부서번호 수정
	public boolean updateDeptnoByEmpno(int empno, int newDeptno) throws NotExistEmpException;
	
	//모든 부서 정보 검색
	public List<DeptDTO> getDeptAll();
}
