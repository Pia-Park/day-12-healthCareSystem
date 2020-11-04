package ca.healthcare.system;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Doctor {
	
	private int id;
	private String fName;
	private String lName;
	private String pNum;
	private String email;
	private String specialty;
	private ArrayList<Appointment> appointmentArr;	
	private static final AtomicInteger counter = new AtomicInteger();
	
	
	public Doctor(String fName, String lName, String pNum, String email, 
			String specialty) {
		
		setId();
		setFName(fName);
		setLName(lName);
		setPNum(pNum);
		setEmail(email);
		setSpecialty(specialty);
		this.appointmentArr = new ArrayList<>();
		
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
	
	public ArrayList<Appointment> getAppointmentArr() {
		return appointmentArr;
	}	
	
	public void setId() {
		this.id = 1000 + counter.getAndIncrement();
		
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
	
	public void setAppointmentArr(Appointment appointmentArr) {
			this.appointmentArr.add(appointmentArr);			
	}
	
	@Override
	public String toString() {
		return "======= Doctor Information =======\nID: " + id +
				"\nName: " + fName + " " + lName +
				"\nPhone Number: " + pNum +
				"\nEmail: " + email +
				"\nSpecialty: " + specialty + "\n";
//				+ "\nAppointment: " + appointmentArr + "\n";
	}
}
