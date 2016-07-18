/********************************************************
*                      NFLPlayer                        *
*-------------------------------------------------------*
* -id: int                                              *
* -number: int                                          *
* -team: string                                         *
* -name: string                                         *
* -position: string                                     *      
* -touchdowns: double                                   *        
* -completions: double                                  *         
* -interceptions: double                                *           
* -passingYards: double                                 *          
* -rushingYards: double                                 *
* -receptions: double                                   *
* -tackles: double                                      *
* -sacks: double                                        *
* -fumbles: double                                      *    
* -forcedFumbles: double                                *            
* -fieldGoalsAttempt: double                            *
* -fieldGoalsMade: double                               *
* -fieldGoalsPercentage: double                         *
* -fieldGoalsDisctance: double                          *
* -dateTraded: date                                     *
* -dateAdded: date                                      * 
* +NFLPlayer()                                          *
********************************************************/

import java.util.Date;

public class NFLPlayer {
	private int id;
	private int number;
	private String team;
	private String name;
	private String status;
	private String position;
	private double touchdowns;
	private double completions;
	private double interceptions;
	private double passingYards;
	private double rushingYards;
	private double receptions;
	private double tackles;
	private double sacks;
	private double fumbles;
	private double forcedFumbles;
	private double fieldGoalsAttempt;
	private double fieldGoalsMade;
	private double fieldGoalsPercentage;
	private double fieldGoalsDisctance;
	private Date dateTraded;
	private Date dateAdded;
	
	// Create Default Player
	NFLPlayer() {
		id = 0;
		number = 0;
		team = "";
		name = ""; 
		status = "";
		position = "";
		touchdowns = 0;
		completions = 0;
		interceptions = 0;
		passingYards = 0;
		rushingYards = 0;
		receptions = 0;
		tackles = 0;
		sacks = 0;
		fumbles = 0;
		forcedFumbles = 0;
		fieldGoalsAttempt = 0;
		fieldGoalsMade = 0;
		fieldGoalsPercentage = 0;
		fieldGoalsDisctance = 0;
		dateAdded = new Date();
	}
		
	// Set Id
	public void setId(int newId) {
		id = newId;
	}
	
	// Set Number
	public void setNumber(int newNumber) {
		number = newNumber;
	}
		
	// Set Team
	public void setTeam(String newTeam) {
		team = newTeam;
	}
	
	// Set Name
	public void setName(String newName) {
		name = newName;
	}
	
	// Set Status
	public void setStatus(String newStatus) {
		status = newStatus;
	}
	
	// Set Position
	public void setPosition(String newPosition) {
		position = newPosition;
	}
	
	// Set TouchDowns
	public void setTouchdowns(double newTouchdowns) {
		touchdowns = newTouchdowns;
	}
	
	// Set Completions
	public void setCompletions(double newCompletions) {
		completions = newCompletions;
	}
	
	// Set Interceptions
	public void setInterceptions(double newInterceptions) {
		interceptions = newInterceptions;
	}
	
	// Set PassingYards
	public void setPassingYards(double newPassingYards) {
		passingYards = newPassingYards;
	}
	
	// Set RushingYards
	public void setRushingYards(double newRushingYards) {
		rushingYards = newRushingYards;
	}

	// Set Receptions
	public void setReceptions( double newReceptions) {
		receptions = newReceptions;
	}

	public void setFieldGoalsAttempt( double newFieldGoalsAttempt){
		fieldGoalsAttempt = newFieldGoalsAttempt;
	}

	
	// Get Id
	public int getId() {
		return id;
	}
	
	// Get Number
	public int getNumber() {
		return number;
	}
		
	// Get Team
	public String getTeam() {
		return team;
	}
	
	// Get Name
	public String getName() {
		return name;
	}
	
	// Get Status
	public String getStatus() {
		return status;
	}

	// Get Position
	public String getPosition() {
		return position;
	}
	
	// Get Touchdowns
	public double getTouchdowns() {
		return touchdowns;
	}
	
	// Get Completions
	public double getCompletions() {
		return completions;
	}
	
	// Get Interceptions
	public double getInterceptions() {
		return interceptions;
	}
	
	// Get PassingYards
	public double getPassingYards() {
		return passingYards;
	}
	
	// Get RushingYards
	public double getRushingYards() {
		return rushingYards;
	}

	// Set Receptions
	public void getReceptions() {
		return receptions;
	}

	public void getFieldGoalsAttempt(){
	return fieldGoalsAttempt;
	}
	
}