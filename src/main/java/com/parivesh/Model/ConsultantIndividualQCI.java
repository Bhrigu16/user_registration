package com.parivesh.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ConsultantIndividualQCI",schema="user_registration")
@PrimaryKeyJoinColumn(referencedColumnName = "Id")
public class ConsultantIndividualQCI extends user{
	
	private String accreditation_no;
	
	private String pan_no;
	
	private Date validity_of_accreditation;
	
	private String name_of_consultant;
	
	private String engagement;
	
	private String role_of_individual;
	
	private String category_of_accreditation;
	
	private String[] sectors_of_accreditation;
}
