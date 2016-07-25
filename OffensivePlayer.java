
public class OffensivePlayer extends NFLPlayer {
	
	private double PassingComp;
	private double PassingAtt;	
	private double PassingPct;	
	private double PassingYds;	
	private double PassingAvg;	
	private double PassingTD;	
	private double PassingInt;	
	private double PassingSck;	
	private double PassingSckY;
	private double PassingRate;
	private double RushingAtt;	
	private double RushingYds;	
	private double RushingAvg;	
	private double RushingTD;	
	private double RushingFUM;
	private double RushingLost;
	private double ReceivingRec;	
	private double ReceivingYds;	
	private double ReceivingAvg;	
	private double ReceivingTD;	
	private double ReceivingLong;

	// Create Default Player
		OffensivePlayer(int id, int number, String team, String name, String status, 
				String height, String weight, String born, String college, double g, double gs, 
				int PassingComp, int PassingAtt, int PassingPct, int PassingYds, 
				int PassingAvg, int PassingTD, int PassingInt, int PassingSck, int PassingSckY, 
				int PassingRate, int RushingAtt, int RushingYds, int RushingAvg, 
				int RushingTD, int RushingFUM, int RushingLost, int ReceivingRec, 
				int ReceivingYds, int ReceivingAvg, int ReceivingTD, int ReceivingLong) {
			super(id, number, team, name, status, height, weight, born, college, g, gs);
			this.setPassingComp(PassingComp);
			this.setPassingAtt(PassingAtt);
			this.setPassingPct(PassingPct);
			this.setPassingYds(PassingYds);
			this.setPassingRate(PassingRate);
			this.setPassingTD(PassingTD);
			this.setPassingInt(PassingInt);
			this.setPassingSck(PassingSck);
			this.setPassingSckY(PassingSckY);
			this.setPassingRate(PassingRate);
			this.setRushingAtt(RushingAtt);
			this.setRushingYds(RushingYds);
			this.setRushingAvg(RushingAvg);
			this.setRushingTD(RushingTD);
			this.setRushingFUM(RushingFUM);
			this.setRushingLost(RushingLost);
			this.setReceivingRec(ReceivingRec);
			this.setReceivingYds(ReceivingYds);
			this.setReceivingAvg(ReceivingAvg);
			this.setReceivingTD(ReceivingTD);
			this.setReceivingLong(ReceivingLong);
		}

		public double getPassingComp() {
			return PassingComp;
		}

		public void setPassingComp(double passingComp) {
			PassingComp = passingComp;
		}

		public double getPassingAtt() {
			return PassingAtt;
		}

		public void setPassingAtt(double passingAtt) {
			PassingAtt = passingAtt;
		}

		public double getPassingPct() {
			return PassingPct;
		}

		public void setPassingPct(double passingPct) {
			PassingPct = passingPct;
		}

		public double getPassingYds() {
			return PassingYds;
		}

		public void setPassingYds(double passingYds) {
			PassingYds = passingYds;
		}

		public double getPassingAvg() {
			return PassingAvg;
		}

		public void setPassingAvg(double passingAvg) {
			PassingAvg = passingAvg;
		}

		public double getPassingTD() {
			return PassingTD;
		}

		public void setPassingTD(double passingTD) {
			PassingTD = passingTD;
		}

		public double getPassingInt() {
			return PassingInt;
		}

		public void setPassingInt(double passingInt) {
			PassingInt = passingInt;
		}

		public double getPassingSck() {
			return PassingSck;
		}

		public void setPassingSck(double passingSck) {
			PassingSck = passingSck;
		}

		public double getPassingSckY() {
			return PassingSckY;
		}

		public void setPassingSckY(double passingSckY) {
			PassingSckY = passingSckY;
		}

		public double getPassingRate() {
			return PassingRate;
		}

		public void setPassingRate(double passingRate) {
			PassingRate = passingRate;
		}

		public double getRushingAtt() {
			return RushingAtt;
		}

		public void setRushingAtt(double rushingAtt) {
			RushingAtt = rushingAtt;
		}

		public double getRushingYds() {
			return RushingYds;
		}

		public void setRushingYds(double rushingYds) {
			RushingYds = rushingYds;
		}

		public double getRushingAvg() {
			return RushingAvg;
		}

		public void setRushingAvg(double rushingAvg) {
			RushingAvg = rushingAvg;
		}

		public double getRushingTD() {
			return RushingTD;
		}

		public void setRushingTD(double rushingTD) {
			RushingTD = rushingTD;
		}

		public double getRushingFUM() {
			return RushingFUM;
		}

		public void setRushingFUM(double rushingFUM) {
			RushingFUM = rushingFUM;
		}

		public double getRushingLost() {
			return RushingLost;
		}

		public void setRushingLost(double rushingLost) {
			RushingLost = rushingLost;
		}

		public double getReceivingRec() {
			return ReceivingRec;
		}

		public void setReceivingRec(double receivingRec) {
			ReceivingRec = receivingRec;
		}

		public double getReceivingYds() {
			return ReceivingYds;
		}

		public void setReceivingYds(double receivingYds) {
			ReceivingYds = receivingYds;
		}

		public double getReceivingAvg() {
			return ReceivingAvg;
		}

		public void setReceivingAvg(double receivingAvg) {
			ReceivingAvg = receivingAvg;
		}

		public double getReceivingTD() {
			return ReceivingTD;
		}

		public void setReceivingTD(double receivingTD) {
			ReceivingTD = receivingTD;
		}

		public double getReceivingLong() {
			return ReceivingLong;
		}

		public void setReceivingLong(double receivingLong) {
			ReceivingLong = receivingLong;
		}
	
}
