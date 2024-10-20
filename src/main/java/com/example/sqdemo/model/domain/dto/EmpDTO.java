package com.example.sqdemo.model.domain.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class EmpDTO {
	private Integer empno;
	private String ename;
	private float sal;
}
