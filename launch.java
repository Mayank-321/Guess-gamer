package guessgame;
import java.util.*;
import javax.lang.model.util.ElementScanner6;

class Guesser
{ 
    int guessnum;
    int guessingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number guesser");
         guessnum=scan.nextInt();
        return guessnum;
    }
} 

 class Player
{
  int guessNum;
int guessingNumber()
{
    Scanner scan = new Scanner(System.in);
    System.out.println("player! kindly enter the number");
    guessNum=scan.nextInt();
    return guessNum;
}
}

class umpier
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

  void collectNumFromGuesser()
  { 
    Guesser g = new Guesser();
    numFromGuesser = g.guessingNumber();
     
  }  
  void collectNumFromPlayer()
  {
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    numFromPlayer1 = p1.guessingNumber();
    numFromPlayer2 = p2.guessingNumber();
    numFromPlayer3 = p3.guessingNumber();
  }  

  void compare()
  {
    if(numFromPlayer1==numFromGuesser)
    {
        if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
        {
            System.out.println("all player won the game");
        }
        else if (numFromGuesser==numFromPlayer2) 
        {
            System.out.println("player 1 and player 2 won the game");
        }
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("player 1 and player 3 won the game ");
        }
        else
        {
        System.out.println("player 1 won the game");
        }   
    }

  else if (numFromPlayer2==numFromGuesser)
  {
    if(numFromGuesser==numFromPlayer3)
    {
        System.out.println("player 2 and player 3 won the game");
    }
    else
    {
    System.out.println("playr 2 won the game");
    }  
}

  else if (numFromPlayer3==numFromGuesser)
  {
    System.out.println("player 3 won the game");
  }
 
  else 
  {
    System.out.println("All player guess the wrong number");
  }
  }

}

public class launch 

{
    public static void main(String[] args) 
    {
  System.out.println("Game started");
  umpier u=new umpier();
  u.collectNumFromGuesser();
  u.collectNumFromPlayer();
  u.compare();
    }
    
}
