package com.example.sqdemo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@ToString
@Table(name = "emp")
public class Emp {

    @Id
    private Integer empno;
    private String ename;
    private float sal;
    private int deptno;
}
