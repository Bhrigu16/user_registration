package com.parivesh.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ConsultantOrganisationQCI",schema="user_registration")
@PrimaryKeyJoinColumn(referencedColumnName = "Id")
public class ConsultantOrganisationQCI extends user{
	
	private String accreditation_no;
	
	private String pan_no;
	
	private Date validity_of_accreditation;
	
	private String name_of_Entity;
	
	private String name_of_Contact_Person;
	
	private Long landline_no;
	
	private String website;
	
	private String organisation_name;
	
	private String head_of_organisation;
	
	private String designation;
	
	private String category_of_accreditation;
	
	private String[] sectors_of_accreditation;
	
}
