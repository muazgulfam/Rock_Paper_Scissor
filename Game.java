import java.util.Scanner;
import java.util.Random;

public class Game{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int a = 1;
        int userscore = 0, botscore = 0 ;
        System.out.println("\n\tGame Instruction\n1.There will be a series of 5 matches and points will be shown in the score card");
        System.out.println("2.The winning player in each combat will be awarded with 2 points");
        System.out.println("3.If the match is tied each player will recieve 2 points\n");
        while (a <= 5){
//Computer creating a random number
            int system_choice  = rand.nextInt(3);
            //System.out.println(system_choice);
        
//User choosing a random number
            System.out.println("\n1 ==> Rock\n2 ==> Paper\n3 ==> Scissor");
            System.out.print("Please enter your selection\t");
            int selection = input.nextInt();

            if(selection == 1 || selection == 2 || selection == 3){

//User and bot's selection
                if(system_choice == 0){
                    System.out.println("\nBot opted for Rock");
                }

                else if(system_choice == 1){
                    System.out.println("\nBot opted for Paper");
                }

                else if(system_choice == 2){
                    System.out.println("\nBot opted for Scissor");
                }

                else{
                    System.out.println("Invalid selection from bot. Please try again");
                }

                if(selection == 1){
                    System.out.println("You opted for Rock");
                }

                else if(selection == 2){
                    System.out.println("You opted for Paper");
                }

                else if(selection == 3){
                    System.out.println("You opted for Scissor");
                }

                else{
                    System.out.println("Invalid Selection. Please Enter only number between 1 to 3");
                }

//Logic
                if(system_choice == 0 && selection == 1){
                    System.out.println("\n\tIt's a Tie");
                    userscore++;
                    botscore++;
                }

                if(system_choice == 0 && selection == 2){
                    System.out.println("\n\tYou win!!");
                    userscore += 2;
                }

                if(system_choice == 0 && selection == 3){
                    System.out.println("\n\tBot wins");
                    botscore += 2;
                }

                if(system_choice == 1 && selection == 1){
                    System.out.println("\n\tBot wins");
                    botscore += 2;
                }

                if(system_choice == 1 && selection == 2){
                    System.out.println("\n\tIt's a Tie");
                    userscore++;
                    botscore++;
                }

                if(system_choice == 1 && selection == 3){
                    System.out.println("\n\tYou win!!");
                    userscore += 2;
                }

                if(system_choice == 2 && selection == 1){
                    System.out.println("\n\tYou win!!");
                    userscore += 2;
                }

                if(system_choice == 2 && selection == 2){
                    System.out.println("\n\tBot wins");
                    botscore += 2;
                }

                if(system_choice == 2 && selection == 3){
                    System.out.println("\n\tIt's a Tie");
                    userscore++;
                    botscore++;
                }


                System.out.println("\n" + "ScoreBoard");
                System.out.println("You        Bot");
                System.out.println(userscore + "           " + botscore);

                System.out.println("\n**-------------------------------------**");

                a++;

            }
            else{
                System.out.println("Invalid Selection. Please Enter only number between 1 to 3");
                break;
            }
        }
    
        

//Score Declaration
        if(userscore > botscore){
            System.out.println("\n\t\tCONGRATULATIONS! YOU WIN");
        }
        else if(userscore < botscore){
            System.out.println("\n\t\tBOT WINS! Better luck next time");
        }
        else{System.out.println("\n\t\tIt's TIE");}
    }
}
