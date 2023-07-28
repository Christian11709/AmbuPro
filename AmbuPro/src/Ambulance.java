public class Ambulance {
    protected boolean status;
    protected int number;

    public Ambulance(boolean empStatus, int empNumber)
   {
      status = empStatus;
      number = empNumber;
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
}

