import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		//create employees and ambulances
		HospitalEmployee vito = new HospitalEmployee("Vito", 1231);
		HospitalEmployee mario = new HospitalEmployee("Mario", 1232);
		HospitalEmployee luigi = new HospitalEmployee("Luigi", 1233);
		Ambulance amOne = new Ambulance(true, 1);
		Ambulance amTwo = new Ambulance(true, 2);
		Ambulance amThree = new Ambulance(true, 3);

		//list of every employee + info
		HospitalEmployee.listStatus();
		//list of every ambulance + info
		Ambulance.listStatus();

		//setting an employee assignment
		vito.setAssignment("Ambulance #2");
		System.out.println("Vito is assigned to " + vito.getAssignment(0));

		//make an ambulance unavailable
		amOne.setStatus(false);
		System.out.println("Ambulance #1 set to unavailable");

		//confirm changes
		HospitalEmployee.listStatus();
		Ambulance.listStatus();


	}

}
