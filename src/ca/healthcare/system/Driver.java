
package ca.healthcare.system;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.JapaneseChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	
	public static void printAllPatient(ArrayList<Patient> ppArr) {
		for(Patient p: ppArr) {
			System.out.println(p.toString());
		}
	}
	
	public static void printAllDoctor(ArrayList<Doctor> ddArr) {
		for (Doctor d : ddArr) {
			System.out.println(d.toString());
		}
	}
	
	public static void printAllAppointment(ArrayList<Appointment> aaArr) {
		for (Appointment a : aaArr) {
			System.out.println(a.toString());
		}
	}
	
	
	public static String answerPD() {
		Scanner input = new Scanner(System.in);
		System.out.println("Hello this is Yuri&Inae health care.\nIf you are a patient, please press 'p'."
				+ "\nIf you are a doctor, Please press 'd': ");
		String answer = input.nextLine();
		
		while(!answer.equalsIgnoreCase("p") && !answer.equalsIgnoreCase("d")) {
			System.err.println("Wrong Information. Please try again.");
			System.out.println("Enter the P(patient) or D(doctor): ");
			answer = input.nextLine();
		} return answer;
	}
	
	public static Patient findPatient(ArrayList<Patient> patients) {
		Scanner input = new Scanner(System.in);
		Patient foundP = null;
		
		while(foundP == null) {
			System.out.println("Enter the Patient ID: ");
			int id = input.nextInt();
			for (Patient patient : patients) {
				if(id == patient.getPId()) {
					return patient;
				} 				
			} 
			System.err.println("Wrong Information. Please try again.");
		}
		
		return foundP;
	}
	
	public static Doctor findDoctor(ArrayList<Doctor> doctors) {
		
		Scanner input = new Scanner(System.in);
		Doctor foundD = null;
		
		while(foundD == null) {
			System.out.println("Enter the Doctor ID: ");
			int id = input.nextInt();
			for (Doctor doctor : doctors) {
				if(id == doctor.getId()) {
					return doctor;
				}
			}
			System.err.println("Wrong Information. Please try again.");
		}
		return foundD;
	}
	
	public static Appointment makeAppoint(Patient patient) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("When would you like to make an appointment?(YYYY/MM/DD/HH/MM): ");
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();
		int hour = input.nextInt();
		int minute = input.nextInt();
		
		return new Appointment(patient, year, month, day, hour, minute);
		
				
	}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Patient p1 = new Patient("Jessica", "Markham", "778 888 888", "Js@gmail.com", 1990, 10, 18, "F");
		Patient p2 = new Patient("Alvin", "Mcguire", "778 111 222","ab@gmail.com", 1975, 12, 18, "M");
		Patient p3 = new Patient("Grover", "Higgs", "604 111 222", "gh@gmail.com",1995, 5, 5, "F");
		Patient p4 = new Patient("Glyn", "Legge", "604 111 223", "gh@gmail.com",1965, 6, 4, "M");
		Patient p5 = new Patient("Imran", "Steele", "604 121 222", "yjygh@gmail.com",1998, 3, 15, "M");
		Patient p6 = new Patient("Mollie", "Mooney", "778 111 222", "mmm@gmail.com",1989, 11, 17, "F");
		Patient p7 = new Patient("Ariana", "Walton", "604 123 222", "arianag@gmail.com",2001, 2, 8, "F");
		Patient p8 = new Patient("Elyas", "Dowling", "604 234 999", "egt@gmail.com",1995, 5, 5, "M");
		Patient p9 = new Patient("Kamron", "Whittington", "234 111 222", "came@gmail.com",2008, 4, 25, "F");
		Patient p10 = new Patient("Arnav", "Wills", "243 111 222", "awr@gmail.com",19755, 1, 5, "M");
		
		ArrayList<Patient> pArr = new ArrayList<Patient>();
		pArr.add(p1);
		pArr.add(p2);
		pArr.add(p3);
		pArr.add(p4);
		pArr.add(p5);
		pArr.add(p6);
		pArr.add(p7);
		pArr.add(p8);
		pArr.add(p9);
		pArr.add(p10);		
		
		Doctor d1 = new Doctor("Corrina","Macias", "778 111 1122", "cmd@gmail.com", "surgery");
		Doctor d2 = new Doctor("John","Mcghee", "776 211 1562", "jmcd@gmail.com", "cerebral surgery");
		Doctor d3 = new Doctor("Ross","Povey", "778 111 3333", "rpg@gmail.com", "Cardiac surgery");
		Doctor d4 = new Doctor("Anil","Chetty", "778 111 2244", "acd@gmail.com", "Padiatric surgery");
		
		ArrayList<Doctor> dArr = new ArrayList<Doctor>();
		dArr.add(d1);
		dArr.add(d2);
		dArr.add(d3);
		dArr.add(d4);
				
		
		Appointment a1 = new Appointment(p1, 2020, 11, 20, 10, 00);
		Appointment a2 = new Appointment(p2, 2020, 11, 23, 11, 00);
		ArrayList<Appointment> aArr = new ArrayList<Appointment>();
		aArr.add(a1);
		aArr.add(a2);
		d1.getAppointmentArr().add(a1);
		d3.getAppointmentArr().add(a2);
		
		
		String answer = answerPD();
		
		if(answer.equalsIgnoreCase("p")) {
			Patient patient = findPatient(pArr);
			System.out.println(patient);
			Doctor doctor = findDoctor(dArr);
			Appointment a = makeAppoint(patient);
			System.out.println(a);
			doctor.setAppointmentArr(a);
			System.out.println("Your Appointment is " + a.getAppointmentDate().getMonth() 
					+ " " + a.getAppointmentDate().getDayOfMonth() + " " + a.getAppointmentDate().getYear() 
					+ " " + a.getAppointmentDate().getHour() + ":" + a.getAppointmentDate().getMinute() + 
					" with Doctor " + doctor.getFName() + " " + doctor.getLName());			
						
		} else if(answer.equalsIgnoreCase("d")) {
			Doctor doctor = findDoctor(dArr);
			System.out.println(doctor);
			if(doctor.getAppointmentArr().isEmpty()) {
				System.out.println("You don't have any appointment.");
			} else {
				System.out.println(doctor.getAppointmentArr());
				System.out.println("Your Appointment is " + doctor.getAppointmentArr().get(0).getAppointmentDate().getMonth() +
						" " + doctor.getAppointmentArr().get(0).getAppointmentDate().getDayOfMonth() + " " + 
						+ doctor.getAppointmentArr().get(0).getAppointmentDate().getYear() + " " +
						doctor.getAppointmentArr().get(0).getAppointmentDate().getHour() + ":" + 
						doctor.getAppointmentArr().get(0).getAppointmentDate().getMinute() + 
						" with Patient " + doctor.getAppointmentArr().get(0).getPatient().getPFName() + " "
						+ doctor.getAppointmentArr().get(0).getPatient().getPLName()); 
			}
		}				


	}

}