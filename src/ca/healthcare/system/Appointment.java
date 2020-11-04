package ca.healthcare.system;

import java.time.LocalDateTime;

public class Appointment extends Patient{
	
	private LocalDateTime appointmentDate;
	
	public Appointment(String pFName, String pLName, String pPNum, String pEmail, int year,  int month, int day, String gender, int aYear, int aMonth, int aDay, int aHour, int aMinute) {
		super(pFName, pLName, pPNum, pEmail, year, month, day, gender);
		setAppointmentDate(aYear, aMonth, aDay, aHour, aMinute);
	}
	
	
	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}
	
	
	public void setAppointmentDate(int aYear, int aMonth, int aDay, int aHour, int aMinute) {
		if(aYear > 0 && aMonth > 0 && aDay > 0 && aHour > 0 && aMinute >= 0) {
			this.appointmentDate = LocalDateTime.of(aYear, aMonth, aDay, aHour, aMinute);			
		} else {
			this.appointmentDate = null;
		}
	}
	
	@Override
	public String toString() {
		return "======= Appointment Information =======\n" + super.toString() +
				"\nAppointment Date: " + appointmentDate + "\n";
				
	}

}
