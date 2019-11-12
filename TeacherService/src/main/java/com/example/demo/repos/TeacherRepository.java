package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
	
	

}
