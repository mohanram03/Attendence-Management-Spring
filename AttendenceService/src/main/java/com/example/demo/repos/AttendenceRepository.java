package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Attendence;

@Repository
public interface AttendenceRepository extends JpaRepository<Attendence, Long> {

}
