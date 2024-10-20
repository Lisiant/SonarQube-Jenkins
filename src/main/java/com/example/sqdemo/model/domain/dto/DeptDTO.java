package com.example.sqdemo.model.domain.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DeptDTO {
	private Integer deptno;	
	private String dname;
	private String loc;
}
