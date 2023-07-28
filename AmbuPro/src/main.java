import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		HospitalEmployee vito = new HospitalEmployee("Vito", 123);
		Ambulance amOne = new Ambulance(true, 1);
		Ambulance amTwo = new Ambulance(true, 2);
		Ambulance amThree = new Ambulance(true, 3);

		vito.work();
		Ambulance.listStatus();

		vito.setAssignment("Ambulance #1");
		System.out.println("Vito is assigned to " + vito.getAssignment(0));

		amOne.setStatus(false);

		Ambulance.listStatus();


	}

}
