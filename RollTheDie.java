public class RollTheDie {

	public static void main(String[] args) {

		System.out.println("Wellcome to snake ladder game: ");

		int startPosition = 0;
		int minimum = 1;
		int maximum = 6;

		int randomValue = (int) Math.floor(Math.random() * (maximum - minimum + 1) + minimum);  //Math.random()*(max-min+1)+min

		System.out.println("Random number between 1 to 6 = " + randomValue);

	}
}
