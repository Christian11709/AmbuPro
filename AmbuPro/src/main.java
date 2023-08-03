import java.util.ArrayList;
import java.util.List;

import javax.management.AttributeNotFoundException;

public class main {

	public static void main(String[] args) {
		//create employees and ambulances
		HospitalEmployee vito = new HospitalEmployee("Vito", 1231);
		HospitalEmployee drybones = new HospitalEmployee("Dry Bones", 1232);
		HospitalEmployee luigi = new HospitalEmployee("Luigi", 1233);
		HospitalDoctor bowser = new HospitalDoctor("Bowser", 2231);
		HospitalDoctor mario = new HospitalDoctor("Mario", 2232);
		HospitalDoctor pepper = new HospitalDoctor("Pepper", 2233);
		Ambulance amOne = new Ambulance(false, 1);
		Ambulance amTwo = new Ambulance(false, 2);
		Ambulance amThree = new Ambulance(false, 3);
		HospitalAttendee attOne = new HospitalAttendee("Teddy Roosevelt", 1, "Bearattack", "WhiteHouse");

		System.out.println("Initial status lists after adding Employees, Doctors, Ambulances, Attendees");
		System.out.println("-----------------------------------------------------------------");
		//list of every employee + info
		HospitalEmployee.listStatus();
		//list of every doctor + info
		HospitalDoctor.listStatus();
		//list of every ambulance + info
		Ambulance.listStatus();
		//list of attendees
		HospitalAttendee.listStatus();

		System.out.println("-----------------------------------------------------------------");
		//set an employee assignment
		vito.setAssignment("Ambulance #2");
		amTwo.setEmployee("Vito");
		System.out.println("Vito is assigned to " + vito.getAssignment(0));
		
		//set a doctor assignment
		pepper.setAssignment("Ambulance #2");
		amTwo.setDoctor("Dr. Pepper");
		System.out.println("Dr. Pepper is assigned to " + vito.getAssignment(0));

		//Ambulance #2 is now staffed. set availability to true
		amTwo.setStatus(true);
		System.out.println("Ambulance #2 set to available");

	
		System.out.println("-----------------------------------------------------------------");
		//confirm changes
		Ambulance.listDetailedStatus();

		System.out.println("-----------------------------------------------------------------");
		//assign patient to staffed/available ambulance
		attOne.setAssignment("Ambulance #2");
		amTwo.setAttendee("Teddy Roosevelt");
		System.out.println("Patient assigned to Ambulance #2");
		//set amTwo to not available since it has an assignment now
		amTwo.setStatus(false);
		System.out.println("Ambulance #2 set to unavailable");

		System.out.println("-----------------------------------------------------------------");
		Ambulance.listDetailedStatus();
		HospitalAttendee.listStatus();


	}

}
