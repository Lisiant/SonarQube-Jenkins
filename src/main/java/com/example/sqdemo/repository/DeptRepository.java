package com.example.sqdemo.repository;

import com.example.sqdemo.model.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<Dept, Integer> {

}
