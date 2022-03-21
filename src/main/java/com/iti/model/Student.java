package com.iti.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
@Table(name="student_registration")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private String stateBoard;
	@Column
	private String hallTicketNumber;
	@Column
	private String passedOutYear;
	@Column
	private String typeOfResult;
	@Column
	private String studetntName;
	@Column
	private String fatherName;
	@Column
	private String motherName;
	@Column
	private String mobileNumber;
	@Column
	private String gmail;
 
}
