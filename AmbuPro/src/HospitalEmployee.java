public class HospitalEmployee {
    protected String name;
    protected int number;

    public HospitalEmployee(String empName, int empNumber)
   {
      name = empName;
      number = empNumber;
   }

   public void setName(String empName)
   {
      name = empName;
   }

   public void setNumber(int empNumber)
   {
      number = empNumber;
   }

   public String getName()
   {
      return name;
   }

   public int getNumber()
   {
      return number;
   }

   public String toString()
   {
      return name + "\t" + number;
   }

   public void work()
   {
      System.out.println(name + " works for the hospital.");
   }
}
