package interfaceAbstractDemo.Entities;

import java.util.Date;

import interfaceAbstractDemo.Abstarct.IEntity;

public class Customer implements IEntity{
	
	private String firstName;
	private String lastName;
	private Date dateOfBird;
	private String nationalityId;

	
	public Customer() {
		
	}


	public Customer( String firstName, String lastName, Date dateOfBird, String nationalityId) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBird = dateOfBird;
		this.nationalityId = nationalityId;
	}



	


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDateOfBird() {
		return dateOfBird;
	}


	public void setDateOfBird(Date dateOfBird) {
		this.dateOfBird = dateOfBird;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	

}
