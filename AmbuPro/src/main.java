
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalEmployee vito = new HospitalEmployee("Vito", 123);
		Ambulance amOne = new Ambulance("Available", 1);

		System.out.println(vito);
		System.out.println(amOne);

		vito.work();
		amOne.status();

		vito.setAssignment("Ambulance #1");
		vito.getNumber();
		System.out.println("Vito is assigned to: " + vito.getAssignment(0));
	}

}
