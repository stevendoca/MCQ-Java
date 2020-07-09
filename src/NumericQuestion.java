/**
 * The NumericQuestion class stimulates numeric question which is sub-class of question, including:
 *  Numeric Question constructor
 *  isCorrect method that check attempted answer is correct with tolerance
 */

	
public class NumericQuestion extends Question {
	private double tolerance;
	
	/**
	 * This constructor creates a new numeric question
	 * @param q This is the first string parameter to numeric question constructor
	 * @param a This is the second string parameter to numeric question constructor
	 * @param t This is the third double parameter to numeric question constructor
	 * @param d This is the fourth integer parameter to numeric question constructor
	 */
	public NumericQuestion (String q, String a, double t, int d) {
		super (q,a,d);
		this.tolerance = t;
	}
	
	/**
	 * This method return boolean to check whether attempted answer is correct for the question
	 * @param answer. This is a string parameter for isCorrect method
	 * @return boolean Will return true if attempted answer is in the range of correct answer +/- tolerance
	 */
	public boolean isCorrect (String answer) {
		double acceptedAnswer = Double.parseDouble(super.getAnswer()) + tolerance;
		double acceptedAnswer1 = Double.parseDouble(super.getAnswer()) - tolerance;
		double attemptedAnswer = Double.parseDouble(answer);
		
		if (attemptedAnswer <= acceptedAnswer && attemptedAnswer >= acceptedAnswer1) {
			return true;
		} else {
			return false;
		}
	}

}
