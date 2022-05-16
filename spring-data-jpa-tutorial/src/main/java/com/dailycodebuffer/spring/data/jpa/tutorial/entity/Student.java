package com.dailycodebuffer.spring.data.jpa.tutorial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="tbl_student")
public class Student {
	
	@Id
	private Long studentId;
	private String firstName;
	private String lastName;
	@Column(name="email_address")
	private String emailId;
	private String guardianName;
	private String guardianEmail;
	private String guardianMobile;
}
