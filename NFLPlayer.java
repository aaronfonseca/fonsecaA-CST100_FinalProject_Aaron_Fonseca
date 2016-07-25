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

public class NFLPlayer {
	private int id;
	private int number;
	private String team;
	private String name;
	private String status;
    private String height;
    private String weight;
    private String born;
    private String college;
    private double g;
    private double gs;
    
	
	// Create Default Player
	public NFLPlayer() {
		this(0, 0, "unknown", "unknown", "unknown", "unknown", "unknown", "unknown", "unknown", 0, 0);
	}
	
	// Create Player with specific values
	public NFLPlayer(int id, int number, String team, String name, String status, 
			String height, String weight, String born, String college, double g, double gs) {
		this.setId(id);
		this.setNumber(number);
		this.setTeam(team);
		this.setName(name);
		this.setStatus(status);
	    this.setHeight(height);
	    this.setWeight(weight);
	    this.setBorn(born);
	    this.setCollege(college);
	    this.setG(g);
	    this.setGs(gs);
	}

	// Get Id
	public int getId() {
		return id;
	}
		
	// Set Id
	public void setId(int newId) {
		id = newId;
	}
	
	
	// Get Number
	public int getNumber() {
		return number;
	}
	
	// Set Number
	public void setNumber(int newNumber) {
		number = newNumber;
	}
		
	// Get Team
	public String getTeam() {
		return team;
	}
		
	// Set Team
	public void setTeam(String newTeam) {
		team = newTeam;
	}
	
	// Get Name
	public String getName() {
		return name;
	}
	
	// Set Name
	public void setName(String newName) {
		name = newName;
	}
	
	// Get Status
	public String getStatus() {
		return status;
	}
	
	// Set Status
	public void setStatus(String newStatus) {
		status = newStatus;
	}
	
	// Get Height
	public String getHeight() {
		return height;
	}

	// Set Height
	public void setHeight(String height) {
		this.height = height;
	}

	// Get Weight
	public String getWeight() {
		return weight;
	}

	// Set Weight
	public void setWeight(String weight) {
		this.weight = weight;
	}

	// Get Born
	public String getBorn() {
		return born;
	}

	// Set Born
	public void setBorn(String born) {
		this.born = born;
	}

	// Get College
	public String getCollege() {
		return college;
	}

	// Set College
	public void setCollege(String college) {
		this.college = college;
	}

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	public double getGs() {
		return gs;
	}

	public void setGs(double gs) {
		this.gs = gs;
	}
	
}