public class PlayerWonTheGameUC7 {
        public static void main(String[] args) {
                int positionPlayer1 = 0;
                int positionPlayer2 = 0;

                int flagForPlayer1 = 0;
                int flagForPlayer2 = 0;
                int storePositionPlayer1;
                int storePositionPlayer2;
                int countDice=0;

                System.out.println("Snake and Laddar Simulation Game: ");
                while(true) {
                        countDice++;
//                      player 1
                        int randomValuePlayer1 = (int)Math.floor(Math.random() * 10) % 6 + 1;
                        if(flagForPlayer1 == 1)
                        {
                                int randomOption = (int)Math.floor(Math.random() * 10) % 2 + 1;

                                if(randomOption == 1 )
                                {
                                        storePositionPlayer1 = positionPlayer1;
                                        positionPlayer1 += randomValuePlayer1;
                                        if(positionPlayer1 > 100)
                                        {
                                                positionPlayer1 = storePositionPlayer1;
                                        }
                                        System.out.println("\n Player1 Rolled, Dice Value : "+ randomValuePlayer1 +"\n get Laddar so move ahead with +"+ randomValuePlayer1 +"\n Current Player1 Position : "+ positionPlayer1 +"\n");

                                }

                                else if(randomOption == 2)
                                {
                                        positionPlayer1 -= randomValuePlayer1;
                                        if(positionPlayer1 <= 0)
                                        {
                                                positionPlayer1 = 0;
                                                flagForPlayer1 = 0;
                                                System.out.println("\n Player1 is KnockOut.Need Dice value 1 to get inside Game\n");
                                        }
                                        System.out.println("Player1 Rolled, Dice Value : "+ randomValuePlayer1 +"\n Player1 get snake so go behind with -"+randomValuePlayer1+"\n Current Player1 Position : "+positionPlayer1+"\n");
                                }

                        }
                        if(flagForPlayer1 == 0)
                        {
                                flagForPlayer1 = 1;
                                positionPlayer1 = 1;
                                System.out.println("Player1 is entered into Game, and player1 Current position : "+positionPlayer1+"\n");
                        }
                        if(positionPlayer1 >= 100)
                        {
                                System.out.println("Player1 wins with "+countDice+ " Die Rolls");
                                return;
                        }

//                      player 2
                        int randomValuePlayer2 = (int)Math.floor(Math.random() * 10 ) % 6 + 1;
                        if(flagForPlayer2 == 1) {
                                int randomOption2 = (int)Math.floor(Math.random() * 10) % 2 +1;
                                if(randomOption2 == 1)
                                {
                                        storePositionPlayer2 = positionPlayer2;
                                        positionPlayer2 += randomValuePlayer2;
                                        if(positionPlayer2 > 100)
                                        {
                                                positionPlayer2 = storePositionPlayer2;
                                        }
                                        System.out.println("Player2 Rolled, Die Value : "+randomValuePlayer2 +"\n Player2 get Laddar and move ahead with +"+randomValuePlayer2+"\n Current Player2 Position : "+positionPlayer2+"\n");

                                }
                                if(randomOption2 == 2)
                                {
                                        positionPlayer2 -= randomValuePlayer2;
                                        if(positionPlayer2 <= 0)
                                        {
                                                positionPlayer2 = 0;
                                                flagForPlayer2 = 0;
                                                System.out.println("Player2 is KnockOut, Need Die value 1 to get inside Game\n");
                                        }
                                        System.out.println("Player2 Rolled, Die Value : "+randomValuePlayer2 +"\n Player2 get snake so go behind with -"+randomValuePlayer2+"\n Current Player1 Position : "+positionPlayer2+"\n");
                                }
                        }
                        if(flagForPlayer2 == 0) {
                                flagForPlayer2 = 1;
                                positionPlayer2 = 1;
                                System.out.println("\nPlayer2 is entered into Game,and Player2 current position : "+positionPlayer2+"\n");
                        }
                        if(positionPlayer2 >= 100) {
                                System.out.println("Player2 wins with "+countDice+ " Die Rolls");
                                return;
                        }
                }

        }

}
