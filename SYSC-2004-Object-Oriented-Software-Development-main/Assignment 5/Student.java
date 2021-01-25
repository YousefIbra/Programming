
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * 
 * @author Michael Kölling and David Barnes
 * @version 2016.02.29
 */
public class Student extends Person
{
   
    // the amount of credits for study taken so far
    private int credits;

    /**
     * Create a new student with a given name and ID number.
     */
    public Student()
    {
        super();
        credits = 0;
    }
    
    public Student(String fullName, String studentID, String eaddress, 
    String phoneNumber)
    {
        super(fullName, studentID, eaddress, phoneNumber);
        credits = 0;
    }
    
    
    /**
     * Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }
    
    /**
     * Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }
    
    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        String studLoginInName = getName().substring(0,4) + getId().substring(0,3);
        
        return studLoginInName;
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        super.print();
        System.out.println("Credits: " + credits);
        System.out.println("Login Name: " + getLoginName());
        
    }
   
    
}
