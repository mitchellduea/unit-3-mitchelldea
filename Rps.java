import java.util.Scanner;
import java.util.Random;
public class Rps
{
public static void main(String[] args){
    String player;
    //user will play r s or p (hopefully)
    String computer = "";
    //computer will do the same thing
    int compInt;
    //generate a random response
    String r;


    Scanner scan = new Scanner(System.in);
    Random generator = new Random();

    System.out.println("You wanna play Rock paper Scissors. Enter r for rock, p for paper, and s for scissors");



    //What will the computer play either 0 1 2 3. Got this online understnd the concept but its still hard for me to implement it
    compInt = generator.nextInt(3)+1;

    //Converts computer into a string

    if (compInt == 1)
                      computer = "r";
    else if (compInt == 2)
                      computer = "p";
    else if (compInt == 3)
                           computer = "s";

    //getting player info
    System.out.println("What is your play ");
    player = scan.next();


    System.out.println("The computer played " + computer);
//Print what the computers play

    //I tried to use nested ifs to see who won for this. I had alot of trouble with this

              if (player.equals(computer))
              System.out.println("Lame you guys tied");
    else if (player.equals("r"))
                if (computer.equals("s"))
               System.out.println("Rock absolutely destroys scissors... you won");
  else if (computer.equals("p"))
                 System.out.println("Wow paper definetly does not beat rock...you lost");
    else if (player.equals("p"))
                if (computer.equals("s"))
              System.out.println("scissors cuts up paper...sorrry you lose");
    else if (computer.equals("r"))
                  System.out.println("I guess paper beats rock...you win");
    else if (player.equals("s"))
                 if (computer.equals("p"))
                System.out.println("Scissors definetly cuts paper...good job you won");
    else if (computer.equals("r"))
                   System.out.println("Sorry scissors cant beat rock... you lose");
//This definitly took me some time...tried to use as many resouirces as I could and pile it all into this.
       }
     }
