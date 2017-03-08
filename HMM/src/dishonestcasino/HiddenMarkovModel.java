package dishonestcasino;

public class HiddenMarkovModel {
	/*
	 * number of states that hidden markov model have
	 */
	private int numState;

	/*
	 * number of events in each state e.g. dice has 6 possible events from (1 to
	 * 6)
	 */
	private int eventSize;

	/*
	 * transition probability
	 */

	private double transProb[][];

	/*
	 * emission probability
	 */

	private double emissProb[][];

	
	/*
	 * probability of starting state
	 */

	private double iProb[];

	/*
	 * probability of end state
	 */

	private double eProb[];

	
	
	public int getNumState() {
		return numState;
	}

	public void setNumState(int numState) {
		this.numState = numState;
	}

	public int getEventSize() {
		return eventSize;
	}

	public void setEventSize(int eventSize) {
		this.eventSize = eventSize;
	}
	
	public double getTransProb(int i, int j) {
		return transProb[i][j];
	}

	public double[][] getTransProb() {
		return transProb;
	}
	
	public double setTransProb(int i, int j, double prob) {
		return transProb[i][j] = prob;
	}

	public void setTransProb(double[][] transProb) {
		this.transProb = transProb;
	}
	
	public double getEmissProb(int i, int j) {
		
		return emissProb[i][j];
	}
	
	public double[][] getEmissProb() {
		return emissProb;
	}

	public void setEmissProb(double[][] emissProb) {
		this.emissProb = emissProb;
	}

	public double getiProb(int i) {
		return iProb[i];
	}
	
	public double[] getiProb() {
		return iProb;
	}

	public void setiProb(double[] iProb) {
		this.iProb = iProb;
	}

	public double[] geteProb() {
		return eProb;
	}

	public void seteProb(double[] eProb) {
		this.eProb = eProb;
	}

	
}
