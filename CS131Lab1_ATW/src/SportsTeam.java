// Step 1
abstract class SportsTeam  {

	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	// end instance field

	public SportsTeam () {
		String teamName = "";
		String teamMascot = "";
		String headCoach = "";
		int wins = 0;
		int losses = 0;
	}	// end empty-argument constructor

	public SportsTeam (String teamName, String teamMascot, String headCoach) {
		this.teamName = "0";
		this.teamMascot = "0";
		this.headCoach = "0";
	}	// end preferred constructor
	
	public String getTeamName() {
		return teamName;
	}	// end getTeamName
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}	// end setTeamName

	public String getTeamMascot() {
		return teamMascot;
	}	// end getTeamMascot

	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}	// end setTeamMascot

	public String getHeadCoach() {
		return headCoach;
	}	// end getHeadCoach

	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}	// end setHeadCoach

	public int getWins() {
		return wins;
	}	// end getWins

	public void setWins(int wins) {
		this.wins = wins;
	}	// end setWins

	public int getLosses() {
		return losses;
	}	// end getLosses

	public void setLosses(int losses) {
		this.losses = losses;
	}	// end setLosses


	public double getWinPercentage () {
		double winPercentage = (wins/(wins + losses));
		return winPercentage;
	}	// end getWinPercentage
	

	public abstract double[] getStats ();	// end getStats
	
	
		
}	// end class
