package com.parivesh.Model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ProjectProponentIndividual",schema="user_registration")
@PrimaryKeyJoinColumn(referencedColumnName = "Id")
public class ProjectProponentIndividual extends user{

	private String name_of_Entity;
	
	//private String name_of_Contact_Person;
	
	private long landline_No;
	
	private String website;
}
