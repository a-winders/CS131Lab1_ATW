import java.security.SecureRandom;
import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

// Step 1
public class NonPlayerCharacter extends GameCharacter{
	
	private boolean active;
	private String intelligenceType;

	
	// Step 3
	public NonPlayerCharacter () {
		super ();
		this.setActive(false);
		this.setIntelligenceType("AVERAGE");
	}	// end empty-argument constructor
	
	
	
	
	// Step 4
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		super ();
		this.setActive(active);
		this.setIntelligenceType(intelligenceType);
	}	// end preferred constructor


	
	
	
	// Step 5
	public String reportStructure () {
		super.reportStructure();
		StringBuilder sb = new StringBuilder ("==================================\n");
		sb.append("UniqueID: "+getUniqueID()+"\n");
		sb.append("Personality: "+getPersonality()+"\n");
		sb.append("==================================\n");
		sb.append("Active: "+isActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		
		
		return sb.toString();
	}	// end reportStructure method
	
	
	
	
	//Step 6
	public String introduce () {
		super.getUniqueID();
		return ("Hello, my name is "+getUniqueID());
		
		
			}	// end introduce method
	
	
	
	
	// Step 7
	public String exclaim () {
		String[] exclaim =  {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
      	Random r=new Random();        
      	int randomNumber=r.nextInt(exclaim.length);
      	return (exclaim[randomNumber]);
		

		
	}	// end exclaim method


	
	
	
	
	
	// Step 2
	public boolean isActive() {
		return active;
	}	// end getActive


	public void setActive(boolean active) {
		this.active = false;
	}	// end setActive


	public String getIntelligenceType() {
		return intelligenceType;
	}	// end getIntelligenceType


	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}	// end setIntelligenceType
	
	

}//end class
