package com.kh.model.vo;

import oracle.sql.DATE;

public class Member {
	
	private int userNo; 		//	USERNO
	private String userId;		//	USERID
	private String userPwd;		//	USERPWD
	private String userName;	//	USERNAME
	private String gender;		//	GENDER
	private int age;			//	AGE
	private String email; 		//	EMIAL
	private String phone;		//	PHONE
	private String address;		//	ADDRESS
	private String hobby;		//	HOBBY
	private DATE eDate;			//	ENROLL_DATE
	



	public Member(int userNo, String userId, String userPwd, String userName, String gender, int age, String email,
			String phone, String address, String hobby, DATE eDate) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.hobby = hobby;
		this.eDate = eDate;
	}




	public int getUserNo() {
		return userNo;
	}




	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}




	public String getUserId() {
		return userId;
	}




	public void setUserId(String userId) {
		this.userId = userId;
	}




	public String getUserPwd() {
		return userPwd;
	}




	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPhone() {
		return phone;
	}




	public void setPhone(String phone) {
		this.phone = phone;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getHobby() {
		return hobby;
	}




	public void setHobby(String hobby) {
		this.hobby = hobby;
	}




	public DATE geteDate() {
		return eDate;
	}




	public void seteDate(DATE eDate) {
		this.eDate = eDate;
	}


	@Override
	public String toString() {
		return "Member [userNo=" + userNo + ", userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName
				+ ", gender=" + gender + ", age=" + age + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", hobby=" + hobby + ", eDate=" + eDate + "]";
	}
	

}


