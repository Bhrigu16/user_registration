package com.parivesh.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Id;
import lombok.Data;


@Data
@Entity
@Table(name="user",schema="user_registration")
@Inheritance(strategy=InheritanceType.JOINED)
public class user {
	//Common Fields in User-Registration :: Address   State/UT        Email-ID    Mobile NoDistrict    PIN Code .
	//Fields in Admin : First Name Last Name  Employee ID     E-MailId    Mobile Number

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;

	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobile")
	private long mobile;
	
	@Column(name="state_ut")
	private String state_ut;
	
	@Column(name="district")
	private String district;
	
	@Column(name="pincode")
	private String pincode;
	

}
