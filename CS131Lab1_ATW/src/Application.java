/**
 * This is the Application object that will launch our application
 * @author Rob Kelley
 * @version 1.3
 * Lab1 
 * CS131ON
 */
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter();
		NonPlayerCharacter npc2 = new NonPlayerCharacter();
		NonPlayerCharacter npc3 = new NonPlayerCharacter();
	
		//Uncomment the line below to ensure reportStructure() method works after you have written it.
		//System.out.println(npc.reportStructure());
		System.out.println(npc.reportStructure());
		System.out.println(npc2.introduce());
		System.out.println(npc3.exclaim());
		
	}//end main

}//end class