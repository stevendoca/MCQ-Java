import static org.junit.Assert.*;

import org.junit.Test;

public class MultiChoiceQuestionTest {

	@Test
	public void test() {
		MultiChoiceQuestion q15 = new MultiChoiceQuestion ("What are popular food in Saigon",5);
		q15.addChoice("pho", true);
		q15.addChoice("comTam", true);
		q15.addChoice("pizza", false);
		q15.addChoice("burger",false);
		assertEquals(q15.getQuestion(),"What are popular food in Saigon");
		assertEquals(q15.getAnswer(),"01");
		Quizz quizz1 = new Quizz (2);
		quizz1.add(q15);
		assertEquals(q15.display(),"");
	
		NumericQuestion q14 = new NumericQuestion ("6.39 + 3.261 is ","10.00", 0.04, 4);
		assertEquals(q14.isCorrect("10.00"),true);

	}

}
