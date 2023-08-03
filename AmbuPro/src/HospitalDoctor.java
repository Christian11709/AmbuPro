import java.util.ArrayList;

public class HospitalDoctor {
    protected String name;
    protected int number;
    protected String assignment;
    protected static ArrayList<HospitalDoctor> doctors = new ArrayList<>();

    public HospitalDoctor(String docName, int docNumber)
   {
      name = docName;
      number = docNumber;
      doctors.add(this);
   }

   public void setAssignment(String docAssignment)
   {
      assignment = docAssignment;
      
   }

   public void setName(String docName)
   {
      name = docName;
   }

   public void setNumber(int docNumber)
   {
      number = docNumber;
   }

   public String getAssignment(int docAssignment)
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
      System.out.println(name + " is a doctor that works for the hospital.");
   }

   public static void listStatus() {
      for (HospitalDoctor doctor : doctors) {
          System.out.println("Name: Dr. " + doctor.name + "\tNumber: " + doctor.number + "\tAssignment: " + doctor.assignment);
      }
  }
}

