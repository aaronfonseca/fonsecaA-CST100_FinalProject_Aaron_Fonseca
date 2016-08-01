
public class DefensivePlayer extends NFLPlayer implements Celebrator {

	private double tacklesComb;
	private double tacklesTotal;
	private double tacklesAst;
	private double tacklesSck;
	private double tacklesSFTY;
	private double InterceptionsPDef;
	private double InterceptionsInt;
	private double InterceptionsYds;
	private double InterceptionsAvg;
	private double InterceptionsLng;
	private double InterceptionsTDs;
	private double FumblesFF;
	
	DefensivePlayer(int id, int number, String team, String name, String status, 
			String height, String weight, String born, String college, double g, double gs, 
			double tacklesComb, double tacklesTotal, double tacklesAst, double tacklesSck, 
			double tacklesSFTY, double InterceptionsPDef, double InterceptionsInt, double InterceptionsYds, 
			double InterceptionsAvg, double InterceptionsLng, double InterceptionsTDs, double FumblesFF){
		super(id, number, team, name, status, height, weight, born, college, g, gs);
		this.setTacklesComb(tacklesComb);
		this.setTacklesTotal(tacklesTotal);
		this.setTacklesAst(tacklesAst);
		this.setTacklesSck(tacklesSck);
		this.setTacklesSFTY(tacklesSFTY);
		this.setInterceptionsPDef(InterceptionsPDef);
		this.setInterceptionsInt(InterceptionsInt);
		this.setInterceptionsYds(InterceptionsYds);
		this.setInterceptionsAvg(InterceptionsAvg);
		this.setInterceptionsLng(InterceptionsLng);
		this.setInterceptionsTDs(InterceptionsTDs);
		this.setFumblesFF(FumblesFF);
		
		
	}

	public double getTacklesComb() {
		return tacklesComb;
	}

	public void setTacklesComb(double tacklesComb) {
		this.tacklesComb = tacklesComb;
	}

	public double getTacklesTotal() {
		return tacklesTotal;
	}

	public void setTacklesTotal(double tacklesTotal) {
		this.tacklesTotal = tacklesTotal;
	}

	public double getTacklesAst() {
		return tacklesAst;
	}

	public void setTacklesAst(double tacklesAst) {
		this.tacklesAst = tacklesAst;
	}

	public double getTacklesSck() {
		return tacklesSck;
	}

	public void setTacklesSck(double tacklesSck) {
		this.tacklesSck = tacklesSck;
	}

	public double getTacklesSFTY() {
		return tacklesSFTY;
	}

	public void setTacklesSFTY(double tacklesSFTY) {
		this.tacklesSFTY = tacklesSFTY;
	}

	public double getInterceptionsPDef() {
		return InterceptionsPDef;
	}

	public void setInterceptionsPDef(double interceptionsPDef) {
		InterceptionsPDef = interceptionsPDef;
	}

	public double getInterceptionsInt() {
		return InterceptionsInt;
	}

	public void setInterceptionsInt(double interceptionsInt) {
		InterceptionsInt = interceptionsInt;
	}

	public double getInterceptionsYds() {
		return InterceptionsYds;
	}

	public void setInterceptionsYds(double interceptionsYds) {
		InterceptionsYds = interceptionsYds;
	}

	public double getInterceptionsAvg() {
		return InterceptionsAvg;
	}

	public void setInterceptionsAvg(double interceptionsAvg) {
		InterceptionsAvg = interceptionsAvg;
	}

	public double getInterceptionsLng() {
		return InterceptionsLng;
	}

	public void setInterceptionsLng(double interceptionsLng) {
		InterceptionsLng = interceptionsLng;
	}

	public double getInterceptionsTDs() {
		return InterceptionsTDs;
	}

	public void setInterceptionsTDs(double interceptionsTDs) {
		InterceptionsTDs = interceptionsTDs;
	}

	public double getFumblesFF() {
		return FumblesFF;
	}

	public void setFumblesFF(double fumblesFF) {
		FumblesFF = fumblesFF;
	}
	
	@Override
	public String celebrate() {
		return " tackles a quarterback to celebrate being drafted.";
		}
	
}