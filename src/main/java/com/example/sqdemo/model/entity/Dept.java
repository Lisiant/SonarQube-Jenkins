package com.example.sqdemo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Table(name = "dept")
public class Dept {

    @Id
    private Integer deptno;

    private String dname;
    private String loc;

}
