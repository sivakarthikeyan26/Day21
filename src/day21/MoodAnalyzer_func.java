package day21;

public class MoodAnalyzer_func {
	String Sad;
	String Happy;
	String Any;
	/**
	 * Constructor to initialize mood
	 */
	public MoodAnalyzer_func() {
		 Sad = "I am in Sad Mood ";
		 Happy = "I am in Happy Mood ";
		 Any = "I am in Any Mood ";
	}
	/**
	 * Method to check the mood
	 * @param mood
	 */
	public void analyze(String mood) {
		try {
			if(mood.equals(Sad)) {
				System.out.println("SAD");
			}
			else if(mood.equals(Happy)) {
				System.out.println("SAD");
			}
			else if(mood.equals(Any)) {
				System.out.println("HAPPY");
			}
			else {
				throw new CustomException_day21("Incorrect message");
			}
		}catch(CustomException_day21 e) {
			System.out.println("Exception :" +e);
		}
	}
}
