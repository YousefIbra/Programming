
/**
 * Write a description of class Instructor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Instructor extends Person
{
    
    private String specialization;
    

    
    public Instructor()
    {
        super();
        specialization = "unknown";
       
    }

    
    public Instructor(String fullName, String instructID, String emailAddress,
    String phoneNumber, String specialization)
    {
        super(fullName, instructID, emailAddress, phoneNumber);
        this.specialization = specialization;
    }
    
    public String getSpecialization()
    {
        return specialization;
    
    }
    
    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
            
    }
    
    public void print()
    {
        super.print();
        System.out.println("Instructor's " + "Specialization: " + specialization);
            
    }   
}
