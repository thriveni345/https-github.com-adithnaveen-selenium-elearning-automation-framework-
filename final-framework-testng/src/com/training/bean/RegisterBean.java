package com.training.bean;

public class RegisterBean {

	private String FirstName,LastName,Email,Telephone,Address1,Address2,City,PostCode,Country,State,Password,PasswordConfirm;

	public RegisterBean() {
	}

	public RegisterBean(String FirstName, String LastName, String Email, String Telephone, String Address1, String Address2, String City, String PostCode, String Country, String State, String Paasword, String PasswordConfirm) {
		super();
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.Telephone = Telephone;
		this.Address1 = Address1;
		this.Address2 = Address2;
		this.City = City;
		this.PostCode = PostCode;
		this.Country = Country;
		this.State = State;
		this.Password = Password;
		this.PasswordConfirm = PasswordConfirm;
		
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String Telephone) {
		this.Telephone = Telephone;
	}
	public String getAddress1() {
		return Address1;
	}

	public void setAddress1(String Address1) {
		this.Address1 = Address1;
	}
	public String getAddress2() {
		return Address2;
	}

	public void setAddress2(String Address2) {
		this.Address2 = Address2;
	}
	public String getCity() {
		return City;
	}

	public void setCity(String City) {
		this.City = City;
	}
	public String getPostCode() {
		return PostCode;
	}

	public void setPostCode(String PostCode) {
		this.PostCode = PostCode;
	}
	public String getCountry() {
		return Country;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}
	public String getState() {
		return State;
	}
	public void setState(String State) {
		this.State = State;
	}
	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}
	public String getPasswordConfirm() {
		return PasswordConfirm;
	}

	public void setPasswordConfirm(String PasswordConfirm) {
		this.PasswordConfirm = PasswordConfirm;
	}

	@Override
	public String toString() {
		return "RegisterBean [FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" +Email+ ", Telephone=" +Telephone+ ", Address1=" +Address1+ ", Address2=" +Address2+ ", City=" +City+ ", PostCode=" +PostCode+ ", Country=" +Country+ ", State=" +State+ ", Password=" +Password+ ", PasswordConfirm=" +PasswordConfirm+ "]";
	}

}


