import java.util.ArrayList;

public class Ambulance {
    protected boolean status;
    protected int number;
    protected String doctor;
    protected String employee;
    protected static ArrayList<Ambulance> ambulances = new ArrayList<>();

    public Ambulance(boolean amStatus, int amNumber)
   {
      status = amStatus;
      number = amNumber;
      ambulances.add(this);
   }

   public void setStatus(boolean amStatus)
   {
      status = amStatus;
   }

   public void setNumber(int amNumber)
   {
      number = amNumber;
   }

   public void setDoctor(String amDoctor) {
      doctor = amDoctor;
   }

   public void setEmployee(String amEmployee) {
      employee = amEmployee;
   }

   public boolean getStatus()
   {
      return status;
   }

   public int getNumber()
   {
      return number;
   }

   public String getDoctor() {
      return doctor;
   }

   public String getEmployee() {
      return employee;
   }

   public String toString()
   {
      return status + "\t" + number;
   }

   public void status()
   {
      String statusString = status ? "Available" : "Not Available";
      System.out.println("Ambulance #" + number + ": " + statusString);
   }

   public static void listStatus() {
    for (Ambulance ambulance : ambulances) {
        System.out.println("Ambulance #" + ambulance.number + ": " + (ambulance.status ? "Available" : "Not Available"));
    }
   }

   public static void listDetailedStatus() {
    for (Ambulance ambulance : ambulances) {
        System.out.println("Ambulance #" + ambulance.number + ": " + (ambulance.status ? "Available" : "Not Available"));
        System.out.println("  Assigned Staff: " + ambulance.doctor + " , " + ambulance.employee);
    } 
   }
}