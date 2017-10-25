// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = "";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        
        Random generator = new Random();
        
        //Get player's play -- note that this is stored as a string
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your play(R, P, S)");
        personPlay = scan.next();
        System.out.println("Your play is: " + personPlay);;
        //Make player's play uppercase for ease of comparison
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3) + 1; 
        //Translate computer's randomly generated play to string
        if (computerInt == 1){
            computerPlay = "R";
        }
        else if (computerInt == 2){
            computerPlay = "P";
        }
        else{
            computerPlay = "S" ;
        }
        //Print computer's play
        System.out.println("Computer play is: " + computerPlay);

        //See who won.
        if (computerPlay.equals("R") && personPlay.equals("S")){
            System.out.print("Computer Wins!");
        }
        else if (computerPlay.equals("S") && personPlay.equals("P")){
            System.out.print("Computer Wins!");
        }
        else if (computerPlay.equals("P") && personPlay.equals("R")){
            System.out.print("Computer Wins!");
        }
        else if (computerPlay.equals("R") && personPlay.equals("P")){
            System.out.print("Player Wins!");
        }
        else if (computerPlay.equals("S") && personPlay.equals("R")){
            System.out.print("Player Wins!");
        }
        else if (computerPlay.equals("P") && personPlay.equals("S")){
            System.out.print("Player Wins!");
        }
        else if (computerPlay.equals("R") && personPlay.equals("R")){
            System.out.print("Tie!");
        }
        else if (computerPlay.equals("P") && personPlay.equals("P")){
            System.out.print("Tie!");
        }
        else{
            System.out.print("Tie!");
        }
    }
}