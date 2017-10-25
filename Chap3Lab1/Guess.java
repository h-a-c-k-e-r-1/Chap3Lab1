// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess = 0;           //Number the user tries to guess
          int guessRight = 0;
          int guess = 0;                //The user's guess
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          numToGuess = generator.nextInt(10) + 1;
          //print message asking user to enter a guess
          System.out.println("Guess a number between 1 and 10");
          guess = scan.nextInt();
          //read in guess
          System.out.println("Youre guess is: " + guess);
          if(guess != numToGuess){
          while (guessRight == 0)  //keep going as long as the guess is wrong
            {
                  //print message saying guess is wrong
                  System.out.println("Your guess is wrong... Try again!");
                  guess = scan.nextInt();
                  if(guess == numToGuess){
                      System.out.println("Your guess is correct!");
                      guessRight = 1;
                    }
                  //get another guess from the user
          }
        }
        else{
            System.out.println("Your guess is correct!");
        }//print message saying guess is right
        }
}
