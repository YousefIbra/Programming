
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
   
    private String name;
    private String id;
    private String emailAddress;
    private String phoneNumber;
    
 
    public Person()
    {
        this.name = "unknown";
        this.id = "unknown";
        this.emailAddress = "unknown";
        this.phoneNumber = "unknown";
    }
    
    public Person(String name, String id, String emailAddress, String phoneNumber)
    {
        this.name = name;
        this.id = id;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    
    }
    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    
    }
    
    public String getName()
    {
        return name;    
    
    }
    
    public String getId()
    {
        return id;    
    
    }
    
    public String getEmailAddress()
    {
        return emailAddress;    
    
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;    
    
    }
    
    public void print()
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Phone  Number: " + phoneNumber);
    
    }
    
}
