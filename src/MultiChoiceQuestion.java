import java.util.ArrayList;
/**
 * The MultiChoiceQuestion class stimulates multiple choice question type that can have more than one correct answer which is. This is a sub-class of question, including:
 *  Multiple Choice Question constructor
 *  addChoice and overridden display method
 */
public class MultiChoiceQuestion extends Question {
	ArrayList<String> arrListChoice;
	
	/**
	 * This constructor creates a new multiple choice question
	 * @param q This is the first string parameter to multiple choice question constructor
	 * @param d This is the second integer parameter to multiple choice question constructor
	 */
	public MultiChoiceQuestion ( String q, int d) {
		super (q,"",d);
		arrListChoice = new ArrayList<String> ();
	}
	
	/**
	 * This method add a question and result(true or false) to array list of question
	 * @param a. This is a first string parameter for addChoice method
	 * @param correct. This is a second boolean parameter for addChoice method
	 */
	public void addChoice ( String a, boolean correct) {
		arrListChoice.add(a);
		if (correct) {
			if (super.getAnswer().equals("No answer")) {
				String answer = Integer.toString(arrListChoice.indexOf(a));
				super.setAnswer(answer);
			} else {
				String answer= super.getAnswer();
				answer+=Integer.toString(arrListChoice.indexOf(a));
				super.setAnswer(answer);
			}

		}
	}
	
	/**
	 * This method display question, level of difficulty, possible answers and instructions 
	 * @return String. This returns question, level of difficulty, possible answers and instructions for display method
	 */
	public String display() {
		String display = super.display();
		display+= "\n";
		for (int i =0; i < arrListChoice.size(); i++) {
			display+= i + "." + " " + arrListChoice.get(i) + "\n";
		}
		display+= "Enter all correct choices. For example, if you think 1 and 2 are correct enter 12";
		return display;
	}	
}
