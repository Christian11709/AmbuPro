import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		HospitalEmployee vito = new HospitalEmployee("Vito", 1231);
		HospitalEmployee mario = new HospitalEmployee("Mario", 1232);
		HospitalEmployee luigi = new HospitalEmployee("Luigi", 1233);
		Ambulance amOne = new Ambulance(true, 1);
		Ambulance amTwo = new Ambulance(true, 2);
		Ambulance amThree = new Ambulance(true, 3);

		HospitalEmployee.listStatus();
		Ambulance.listStatus();

		vito.setAssignment("Ambulance #2");
		System.out.println("Vito is assigned to " + vito.getAssignment(0));

		amOne.setStatus(false);
		System.out.println("Ambulance #1 set to unavailable");

		HospitalEmployee.listStatus();
		Ambulance.listStatus();


	}

}
