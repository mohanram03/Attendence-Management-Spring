package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="userDetails03")
@Data
public class User {

		@Id
		private long userId;
		private String userName;
		private String passWord;
		private String userType;
}
