import java.util.Random;
import java.util.Scanner;
/*TASK 1 : Number Game */
public class Task1{

  public static void main(String[] args) {
    Random Random_number = new Random();
    int correct_guess=Random_number.nextInt(100);
    int turns=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("Guess a number between 1 to 100 there will be 15 turns! for guessing correct answer" );
    System.out.println("All the best!");
    
    int guess;
    int i=0;
    boolean win=false;
    while(win==false) {
      guess=scan.nextInt();
      turns++;
    
    if(guess==correct_guess) {
      win=true;
    }
    else if(i>8){
      System.out.println("Better luck next time");
      System.out.println("Correct answer is: "+correct_guess);
      return;
    }
    else if(guess<correct_guess){
      i++;
      System.out.println("Oops! Your guess was too low, try some higher numbers, Turns left: "+(15-i));
    }
    else if(guess>correct_guess) {
      i++;
      System.out.println("Oops! Your guess was too high, Try some lower numbers, Turns left: "+(15-i));
      
    }
   //displaying user's score
  }
    System.out.println("Great success!");
    System.out.println("Then number was "+correct_guess);
    System.out.println("You used "+turns+" turns to guess the correct number");
    System.out.println("Your score is "+((16-turns)*10)+" out of 100");
}
}