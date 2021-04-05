public class SnakeProblem {

	public static void main(String[] args) {

		System.out.println("Wellcome to snake ladder game: ");

		int position = 0;
		int minimum = 1;
		int maximum = 6;

		int randomValue = (int) Math.floor(Math.random() * (maximum - minimum + 1) + minimum);  //Math.random()*(max-min+1)+min
		int randomOption = (int) (Math.random() * 10) % 3;

		//System.out.println("Random number between 1 to 6 = " + randomValue);
		//System.out.println(randomOption);

		if (randomOption == 0)
		{
			System.out.println("No Play that's why player stay in same position which is " + position );

		}
		else if (randomOption == 1)
		{
			position += randomValue;
			System.out.println("Ladder that's why player move ahead and new position is " + position);

		}
		else if (randomOption == 2)
		{
			if(position == 0)
			{
				position = 0;
			}
			else
			{
				position -= randomValue;
			}
			System.out.println("Snake that's why player move behind and new position is " + position);
		}
             }
}
