package com.parivesh.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="AuditorsAccreditedOrganization",schema="user_registration")
@PrimaryKeyJoinColumn(referencedColumnName = "Id")
public class AuditorsAccreditedOrganization extends user{

	private String accreditation_no;
	
	private String pan_no;
	
	private Date validity_of_accreditation;
	
	private String name_of_contact_person;
	
	private String landline_no;
	
	private String website;
	
	private String organization_name;
	
	private String head_of_organization;
	
	private String designation;
}
