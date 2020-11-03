package ca.healthcare.system;

import java.time.LocalDateTime;

public class Appointment {
	
	private String dateTypeOfPatient;
	private LocalDateTime appointmentDate;
	
	public Appointment(String dateTypeOfPatient, int year, int month, int day, int hour, int minute) {
		setDateTypeOfPatient(dateTypeOfPatient);
		setAppointmentDate(year, month, day, hour, minute);
	}
	
	public String getDateTypeOfPatient() {
		return dateTypeOfPatient;
	}
	
	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}
	
	public void setDateTypeOfPatient(String dateTypeOfPatient) {
		if(!dateTypeOfPatient.isEmpty() && !dateTypeOfPatient.equalsIgnoreCase(null)) {
			this.dateTypeOfPatient = dateTypeOfPatient;
		} else {
			this.dateTypeOfPatient = "Wrong Information.";
		}
	}
	
	public void setAppointmentDate(int year, int month, int day, int hour, int minute) {
		if(year > 0 && month > 0 && day > 0 && hour > 0 && minute >= 0) {
			this.appointmentDate = LocalDateTime.of(year, month, day, hour, minute);			
		} else {
			this.appointmentDate = null;
		}
	}
	
	@Override
	public String toString() {
		return "======= Appointment Information =======\nData type of Patient: " + dateTypeOfPatient +
				"\nAppointment Date: " + appointmentDate;
				
	}

}
