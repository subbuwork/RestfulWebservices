/**
 * 
 */
package com.java.restapi.pojo;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author subbu
 *
 */

@XmlRootElement
public class User {
	private Integer id;
	private String fName;
	private String lName;
	private String addressLine1;
	private String addressLine2;
	private String profession;
	private String dob;
	private String doj;
	private Long salary;
	
	public User(){}
	
	public User(Integer id, String fName, String lName, String addressLine1,
			String addressLine2, String profession, String dob, String doj,
			Long salary) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.profession = profession;
		this.dob = dob;
		this.doj = doj;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}
    
	public void setId(Integer id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}

	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	
	
	

}
