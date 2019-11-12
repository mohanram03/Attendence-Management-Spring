package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="attendence03")
@Data
public class Attendence {

		@Id
		private long attendenceId;
		private double currentAttendence;
		private int leavesTaken;
		private double fineAmount;
		
		
}
