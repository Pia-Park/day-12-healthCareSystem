package ca.healthcare.system;

import java.util.ArrayList;

public class Doctor {
	
	private int id;
	private String fName;
	private String lName;
	private String pNum;
	private String email;
	private String specialty;
	ArrayList<Doctor> appointmentArr;
	
	public Doctor(int id, String fName, String lName, String pNum, String email, 
			String specialty, ArrayList<Doctor> appointmentArr) {
		
		setId(id);
		setFName(fName);
		setLName(lName);
		setPNum(pNum);
		setEmail(email);
		setSpecialty(specialty);
		setAppointmentArr(appointmentArr);
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getFName() {
		return fName;
	}
	
	public String getLName() {
		return lName;
	}
	
	public String getPNum() {
		return pNum;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public ArrayList<Doctor> getAppointmentArr() {
		return appointmentArr;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setFName(String fName) {
		if(!fName.isEmpty() && !fName.equalsIgnoreCase(null)) {
			this.fName = fName;			
		} else {
			this.fName = "Wrong Information.";
		}
	}
	
	public void setLName(String lName) {
		if(!lName.isEmpty() && !lName.equalsIgnoreCase(null)) {
			this.lName = lName;			
		} else {
			this.lName = "Wrong Information.";
		}
	}
	
	public void setPNum(String pNum) {
		if(!pNum.isEmpty() && !pNum.equalsIgnoreCase(null)) {
			this.pNum = pNum;			
		} else {
			this.pNum ="Wrong Information.";
		}
	}
	
	public void setEmail(String email) {
		if(!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;			
		} else {
			this.email = "Wrong Information.";
		}
	}
	
	public void setSpecialty(String specialty) {
		if(!specialty.isEmpty() && !specialty.equalsIgnoreCase(null)) {
			this.specialty = specialty;			
		} else {
			this.specialty = "Wrong Information.";
		}
	}
	
	public void setAppointmentArr(ArrayList<Doctor> appointmentArr) {
		this.appointmentArr = appointmentArr;
	}
}
