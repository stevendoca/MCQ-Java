
public class QuizTime {

	public static void main(String[] args) {
		Question q1 = new Question ("What is the capital of Vietnam","Hanoi",7);
		Question q2 = new Question ("What is the largest city of Vietnam","Saigon",8);
		Question q3 = new Question ("what is the main nation in Vietnam", "kinh",3);
		Question q4 = new Question ("How many river does Vietnam has", "108", 9);
		Question q5 = new Question ("What is the color of sky","blue",2);
		Question q6 = new Question ("How long does it take to finish Computer Study Program in Langara","2",4);
		Question q7 = new Question ("How many credit of CPSC 1181 are","3",2);
		Question q8 = new Question ("What is the second main language in Canada","France",4);
		Question q9 = new Question ("What is a legal age in Vancouver","19",5);
		Question q10 = new Question ("Does library open on weekend","yes",2);
		FillInQuestion q11 = new FillInQuestion ("The color of the _sky_ is blue",1);
		FillInQuestion q12 = new FillInQuestion ("In Vietnam,_Hanoi_ is the capital", 5);
		NumericQuestion q13 = new NumericQuestion ("5.40 + 3.21 is ","8.61", 0.05, 3);
		NumericQuestion q14 = new NumericQuestion ("6.39 + 3.261 is ","10.00", 0.04, 4);
		MultiChoiceQuestion q15 = new MultiChoiceQuestion ("What are popular food in Saigon",5);
		MultiChoiceQuestion q16 = new MultiChoiceQuestion ("What are popular drink in Saigon",5);
		q15.addChoice("pho", true);
		q15.addChoice("comTam", true);
		q15.addChoice("pizza", false);
		q15.addChoice("burger",false);
		q16.addChoice("coffee",true);
		q16.addChoice("beer", true);
		q16.addChoice("coke", false);
		q16.addChoice("ginger beer", false);
		Quizz quizz1 = new Quizz (2);
		quizz1.add(q15);
		quizz1.add(q13);
		quizz1.add(q11);
		quizz1.add(q16);
		quizz1.giveQuizz();
		
	}

}
