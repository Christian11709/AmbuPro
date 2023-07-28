import java.util.ArrayList;

public class Ambulance {
    protected boolean status;
    protected int number;
    protected static ArrayList<Ambulance> ambulances = new ArrayList<>();

    public Ambulance(boolean empStatus, int empNumber)
   {
      status = empStatus;
      number = empNumber;
      ambulances.add(this);
   }

   public void setStatus(boolean empStatus)
   {
      status = empStatus;
   }

   public void setNumber(int empNumber)
   {
      number = empNumber;
   }

   public boolean getStatus()
   {
      return status;
   }

   public int getNumber()
   {
      return number;
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
}