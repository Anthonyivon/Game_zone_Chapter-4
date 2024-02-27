import java.util.Random;
import java.util.Scanner;

public class GameZone4
{
    public static void main (String [] args)

{
// Need to make a program for Gamezone 4 that generates a random number between 1-100 and tries to make the user guess it and display whether the guess was to high or to low
// lines 10-16 are my variables and my input 
int userNumber;
int MIN_NUM=1;
int MAX_NUM= 100;
int randomNumber;
Random random= new Random();
randomNumber=random.nextInt(100);
Scanner j= new Scanner (System.in);
// 


System.out.println("choose a random number between 1-100");
 userNumber=j.nextInt(); 


if(userNumber > randomNumber){
    System.out.println("the number you choose is greater "+ randomNumber);
}
else if (userNumber < randomNumber){
    System.out.println("The number you choose is less than "+ randomNumber);
}
else {System.out.println ("the number you choose is equal to "+randomNumber);}
  
}
}