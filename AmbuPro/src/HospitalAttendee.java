import java.util.ArrayList;

public class HospitalAttendee {
    protected String name;
    protected int number;
    protected String medical;
    protected String location;
    protected String assignment;
    protected static ArrayList<HospitalAttendee> attendees = new ArrayList<>();

    public HospitalAttendee(String attName, int attNumber, String attMedical, String attLocation)
   {
      name = attName;
      number = attNumber;
      medical = attMedical;
      location = attLocation;
      attendees.add(this);
   }

   public void setAssignment(String attAssignment)
   {
      assignment = attAssignment;
   }

   public void setName(String attName)
   {
      name = attName;
   }

   public void setNumber(int attNumber)
   {
      number = attNumber;
   }

   public String getAssignment(int attAssignment)
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

   public String getLocation() {
      return location;
   }
   
   public String toString()
   {
      return name + "\t" + number;
   }

   public void work()
   {
      System.out.println(name + " is a patient.");
   }

   public static void listStatus() {
      for (HospitalAttendee attendee : attendees) {
          System.out.println("Patient Name: " + attendee.name + "\tMedical: " + attendee.medical + "\tLocation: " + attendee.location + "\tAssignment: " + attendee.assignment);
      }
  }
}
