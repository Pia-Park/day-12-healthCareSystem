package ca.healthcare.system;

import java.time.LocalDateTime;

public class Appointment {
	
	private LocalDateTime appointmentDate;
	private Patient patient;
	
	public Appointment(Patient patient, int aYear, int aMonth, int aDay, int aHour, int aMinute) {
		
		setPatient(patient);
		setAppointmentDate(aYear, aMonth, aDay, aHour, aMinute);
	}
	
	
	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}
	
	public Patient patient() {
		return patient;
	}
	
	public void setAppointmentDate(int aYear, int aMonth, int aDay, int aHour, int aMinute) {
		if(aYear > 0 && aMonth > 0 && aDay > 0 && aHour > 0 && aMinute >= 0) {
			this.appointmentDate = LocalDateTime.of(aYear, aMonth, aDay, aHour, aMinute);			
		} else {
			this.appointmentDate = null;
		}
	}
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	@Override
	public String toString() {
		return "======= Appointment Information =======\n" + patient +
				"\nAppointment Date: " + appointmentDate + "\n";
				
	}

}
