import java.util.ArrayList;

public class HospitalEmployee {
    protected String name;
    protected int number;
    protected String assignment;
    protected static ArrayList<HospitalEmployee> employees = new ArrayList<>();

    public HospitalEmployee(String empName, int empNumber)
   {
      name = empName;
      number = empNumber;
      employees.add(this);
   }

   public void setAssignment(String empAssignment)
   {
      assignment = empAssignment;
   }

   public void setName(String empName)
   {
      name = empName;
   }

   public void setNumber(int empNumber)
   {
      number = empNumber;
   }

   public String getAssignment(int empAssignment)
   {
     return assignment;
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

   public static void listStatus() {
      for (HospitalEmployee employee : employees) {
          System.out.println("Name: " + employee.name + "\tNumber: " + employee.number + "\tAssignment: " + employee.assignment);
      }
  }
}
