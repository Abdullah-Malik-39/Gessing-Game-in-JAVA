package guessing_game;
import static java.lang.Character.toUpperCase;
import java.util.Random;
import java.util.Scanner;
public class Guessing_game {
    public static void main(String[] args) {
        int choice,tries=3,flag=0;
        float win_perc=100;
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("1. Guess the Number.");
        System.out.println("2. Guess the Alphabet.");
        System.out.println("3. Guess the Word.");
        System.out.println("--------------------------------------------");
        System.out.print("Enter your Choice : ");
        choice = scan.nextInt();
        System.out.println("--------------------------------------------");
        switch (choice)
        {
            case 1 :
            {
                System.out.println("You selected Number Guessing Game.");
                System.out.println("Guess a Number between 0,9");
                int number = 1 + (int)(9* Math.random());
                for(int i=2;i>=0;i--)
                {   
                    System.out.println("--------------------------------------------");
                    System.out.print("Enter Your Guess : ");
                    int input = scan.nextInt();
                    if(input == number && tries!=0)
                    {
                        System.out.println("You Guessed Right");
                        System.out.println("Your Accuracy = "+win_perc+"%");
                        flag=0;
                        break;
                    }
                    else
                    {
                        win_perc=win_perc-34;
                        System.out.println("Wrong guess");
                        System.out.println("You have "+i+" tries Remaining!");
                        flag=1;
                    }
                }
                if(flag==1)
                    System.out.println("You Lost the Game");
                else
                    System.out.println("You Won the Game");
                System.out.println("--------------------------------------------");
                break;
            }
            case 2 :
            {
                System.out.println("You selected Character Guessing Game.");
                System.out.println("Guess a Character between A,Z");
                Random r = new Random();
                char character =toUpperCase((char)(r.nextInt(26) + 'a'));
                for(int i=2;i>=0;i--)
                {   
                    System.out.println("--------------------------------------------");
                    System.out.print("Enter Your Guess : ");
                    char input;
                    input = toUpperCase(scan.next().charAt(0));
                    if(input == character && tries!=0)
                    {
                        System.out.println("You Guessed Right");
                        System.out.println("Your Accuracy = "+win_perc+"%");
                        flag=0;
                        break;
                    }
                    else
                    {
                        win_perc=win_perc-34;
                        System.out.println("Wrong guess");
                        System.out.println("You have "+i+" tries Remaining!");
                        flag=1;
                    }
                }
                if(flag==1)
                    System.out.println("You Lost the Game");
                else
                    System.out.println("You Won the Game");
                System.out.println("--------------------------------------------");
                break;
            }
            case 3 :
            {
                String[] arr = {"Red", "Ali", "Cat", "Apple", "Bus"}; 
                Random r=new Random(); 
                int randomNumber=r.nextInt(arr.length); 
                String str = arr[randomNumber];
                str = str.toUpperCase();
                System.out.println("--------------------------------------------");
                System.out.println("You selected Word Guessing Game.");
                System.out.println("Guess a Word from among the following");
                for(int j = 0;j<=4;j++)
                    System.out.print(arr[j]+"  "); 
                System.out.println(" ");
                for(int i=2;i>=0;i--)
                {   
                    String input;
                    System.out.println("--------------------------------------------");
                    System.out.print("Enter Your Guess : ");
                    input = scan.next();
                    input = input.toUpperCase();
                    if(input.equals(str) && tries!=0)
                    {
                        System.out.println("You Guessed Right");
                        System.out.println("Your Accuracy = "+win_perc+"%");
                        flag=0;
                        break;
                    }
                    else
                    {
                        win_perc=win_perc-34;
                        System.out.println("Wrong guess");
                        System.out.println("You have "+i+" tries Remaining!");
                        flag=1;
                    }
                }
                if(flag==1)
                    System.out.println("You Lost the Game");
                else
                    System.out.println("You Won the Game");
                System.out.println("--------------------------------------------");
                break;
            }
            default :
            {
                System.out.println("Invalid Input!");
                System.out.println("--------------------------------------------");
            }
        }
        scan.close();
    }
}