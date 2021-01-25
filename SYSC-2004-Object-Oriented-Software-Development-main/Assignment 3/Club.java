/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Club
{
    private ArrayList members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList();
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    public void addMember(String name, int month, int year)
    {
        members.add(new Membership(name, month, year));
    }
}
