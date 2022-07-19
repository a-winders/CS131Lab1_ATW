
public class BasketballTeam extends SportsTeam {

	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	// end instance fields
	
	
	
	// Step 1
	public BasketballTeam () {
		int fieldGoals = 0;
		int fieldGoalsAttempted = 0;
		int freeThrows = 0;
		int freeThrowsAttempted = 0;	
	}	// end empty-argument constructor
	
	
	
	
	
	// Step 2
	public BasketballTeam (String teamName, String teamMascot, String headCoach) {
	}	// end preferred constructor
	
	
	
	
	
	// Step 3
	public double fieldGoalPercentage () {
		return (fieldGoals/fieldGoalsAttempted);
	}	// end fieldGoalPercentage
	
	
	
	
	
	// Step 4
	public double freeThrowPercentage () {
		return (freeThrows/freeThrowsAttempted);
	}	// end freeThrowPercentage
	

	
	
	
	public double [] getStats () {
		double [] stats = {super.getWinPercentage(), fieldGoalPercentage (), freeThrowPercentage ()};
		for (int i = 0; i < stats.length; i ++) {
			System.out.print(stats[i]);
		}
		
		return stats;

	}	// end getStats
	
	
	
	
	
	
	public void setStats (int wins, int losses,int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
	this.wins = wins;
	this.losses = losses;
	this.fieldGoals = fieldGoals;
	this.fieldGoals = fieldGoalsAttempted;
	this.freeThrows = freeThrows;
	this.freeThrowsAttempted = freeThrowsAttempted;
	}	// end setStats





	private int getFieldGoals() {
		return fieldGoals;
	}	// end getFieldGoals





	private void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}	//end setFieldGoals





	private int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}	// end getFieldGoalsAttempted





	private void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}	// end setFieldGoalsAttempted





	private int getFreeThrows() {
		return freeThrows;
	}	// end getFreeThrows





	private void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}	// end setFreeThrows





	private int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}	// end getFreeThrowsAttempted





	private void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}	// end setFreeThrowsAttempted



}	// end class
