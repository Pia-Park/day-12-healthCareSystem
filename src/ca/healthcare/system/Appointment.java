package ca.healthcare.system;

import java.time.LocalDateTime;

public class Appointment {
	
	private String dateTypeOfPatient;
	private LocalDateTime appointmentDate;
	
	public Appointment() {
		
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
	
	public void setAppointmentDate(LocalDateTime appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

}
