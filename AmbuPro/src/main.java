import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		//create employees and ambulances
		HospitalEmployee vito = new HospitalEmployee("Vito", 1231);
		HospitalEmployee mario = new HospitalEmployee("Mario", 1232);
		HospitalEmployee luigi = new HospitalEmployee("Luigi", 1233);
		HospitalDoctor bowser = new HospitalDoctor("Bowser", 2231);
		HospitalDoctor drybones = new HospitalDoctor("DryBones", 2232);
		HospitalDoctor pepper = new HospitalDoctor("Pepper", 2233);
		Ambulance amOne = new Ambulance(false, 1);
		Ambulance amTwo = new Ambulance(false, 2);
		Ambulance amThree = new Ambulance(false, 3);

		//list of every employee + info
		HospitalEmployee.listStatus();
		//list of every doctor + info
		HospitalDoctor.listStatus();
		//list of every ambulance + info
		Ambulance.listStatus();

		//set an employee assignment
		vito.setAssignment("Ambulance #2");
		System.out.println("Vito is assigned to " + vito.getAssignment(0));
		
		//set a doctor assignment
		pepper.setAssignment("Ambulance #2");

		//Ambulance #2 is now staffed. set availability to true
		amOne.setStatus(true);
		System.out.println("Ambulance #1 set to available");

		//confirm changes
		HospitalEmployee.listStatus();
		HospitalDoctor.listStatus();
		Ambulance.listStatus();


	}

}
