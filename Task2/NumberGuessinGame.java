import java.util.Random;
import java.util.Scanner;
public class NumberGuessinGame{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int rand = (int) (Math.random() *100);
        int guess=0;
        for(int i=0; i<5; i++){
            guess++;
            System.out.print("guess a number between 1 to 100:");
            guess=sc.nextInt();
            if (rand==guess){
                System.out.println("Good job,the number is " +guess);
                
            } 
            else if(guess < rand){
                System.out.println("The number is lower" );
                
            }
            else if(guess > rand){
                System.out.println("the number is higher");                
            }
           
        }
        System.out.println("The number is "+rand);
        
    }

}
