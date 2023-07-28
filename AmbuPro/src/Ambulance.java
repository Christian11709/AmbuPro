public class Ambulance {
    protected String status;
    protected int number;

    public Ambulance(String empStatus, int empNumber)
   {
      status = empStatus;
      number = empNumber;
   }

   public void setStatus(String empStatus)
   {
      status = empStatus;
   }

   public void setNumber(int empNumber)
   {
      number = empNumber;
   }

   public String getStatus()
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
      System.out.println("Ambulance #" + number + ": " + status);
   }
}

