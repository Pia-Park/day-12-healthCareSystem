package ca.healthcare.system;

import java.time.LocalDate;

public class Patient {
	
	private int pId;
	private String pFName;
	private String pLName;
	private String pPNum;
	private String pEmail;
	private LocalDate bDate;
	private String gender;
	
	public Patient(int pId, String pFName, String pLName, String pPNum, 
			String pEmail, int year, int month, int day, String gender) {
		
		setPId(pId);
		setPFName(pFName);
		setPLName(pLName);
		setPPNum(pPNum);
		setPEmail(pEmail);
		setbDate(year, month, day);
		setGender(gender);
		
	}
	
	public int getPId() {
		return pId;
	}
	
	public String getPFName() {
		return pFName;
	}
	
	public String getPLName() {
		return pLName;
	}
	public String getPPNum() {
		return pPNum;
	}
	
	public String getPEmail() {
		return pEmail;
	}
	
	public LocalDate getBDate() {
		return bDate;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setPId(int pId) {
		this.pId = pId;
	}
	
	public void setPFName(String pFName) {
		if(!pFName.isEmpty() && !pFName.equalsIgnoreCase(null)) {
			this.pFName = pFName;			
		} else {
			this.pFName = "Wrong Information.";
		}
	}
	
	public void setPLName(String pLName) {
		if(!pLName.isEmpty() && !pLName.equalsIgnoreCase(null)) {
			this.pLName = pLName;			
		} else {
			this.pLName = "Wrong Information.";
		}
	}
	
	public void setPPNum(String pPNum) {
		if(!pPNum.isEmpty() && !pPNum.equalsIgnoreCase(null)) {
			this.pPNum = pPNum;			
		} else {
			this.pPNum = "Wrong Information.";
		}
	}
	
	public void setPEmail(String pEmail) {
		if(!pEmail.isEmpty() && !pEmail.equalsIgnoreCase(null)) {
			this.pEmail = pEmail;			
		} else {
			this.pEmail = "Wrong Information.";
		}
	}
	
	
	public void setbDate(int year, int month, int day) {
		if (year > 0 && month > 0 && day > 0) {
	        this.bDate = LocalDate.of(year, month, day);
		} else {
			this.bDate = null;
		}
	}
	
	public void setGender(String gender) {
		if(!gender.isEmpty() && !gender.equalsIgnoreCase(null)) {
			this.gender = gender;			
		} else {
			this.gender = "Wrong Information.";
		}
	}
	

}
