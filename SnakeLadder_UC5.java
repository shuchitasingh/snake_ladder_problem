public class SnakeLadder_UC5 {

	public static void main(String[] args) {

		//System.out.println("Welcome to snake ladder game: ");

		int position = 0;
		int TempPosition;
		int minimum = 1;
		int maximum = 6;

		while(position < 100)
		{
			int randomValue = (int) Math.floor(Math.random() * (maximum - minimum + 1) + minimum);  //Math.random()*(max-min+1)+min
//			System.out.println("randomvalue" + randomValue);

			int randomOption = (int) (Math.random() * 10) % 3;
//			System.out.println("randomoption" + randomOption);

			if(randomOption == 0 && position == 0)
				position = 0;

			else if(randomOption == 1 && position < 100)
			{
				int storeValue = position;
				position += randomValue;
				if(position > 100)
					position = storeValue;
			}
			else if(randomOption ==2)
			{
				position -= randomValue;
				if(position < 0 )
					position = 0;
			}
		System.out.println("position" + position);
		}
	}


}
