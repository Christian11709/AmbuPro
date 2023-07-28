
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalEmployee vito = new HospitalEmployee("Vito", 123);
		Ambulance amOne = new Ambulance(true, 1);
		Ambulance amTwo = new Ambulance(true, 2);
		Ambulance amThree = new Ambulance(true, 3);

		vito.work();
		amOne.status();
		amTwo.status();
		amThree.status();

		vito.setAssignment("Ambulance #1");
		System.out.println("Vito is assigned to " + vito.getAssignment(0));
	}

}
