/**
 * The FillInQuestion class stimulates fill-in question which is sub-class of question, including:
 *  Fill In Question constructor
 */
public class FillInQuestion extends Question{
	private String state;

	/**
	 * The FillInQuestion constructor creates new fill-in question:
	 * @param state This is the first string parameter to fill-in question constructor
	 * @param diff This is the second int parameter to fill-in question constructor
	 */
	public FillInQuestion (String state, int diff) {
		super ("","",diff);
		int firstUnderScorce = state.indexOf ('_');
		int lastUnderScorce = state.lastIndexOf ('_');
		String firstPartQuestion = state.substring(0,firstUnderScorce);
		String secondPartQuestion = state.substring(lastUnderScorce+1);
		String answer= state.substring(firstUnderScorce +1,lastUnderScorce);
		String question = firstPartQuestion + "__" + secondPartQuestion;
		super.setQuestion(question);
		super.setAnswer(answer);
	}

}
