// AUTHOR - HIMANK JESHWAR
// MADE ON - 17/12/2021
import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {        
        Random ra = new Random();
        // THE BELOW CODE IS FOR MAIN MENU
        while (true){
            // design of the main menu
            System.out.print("\t\t ==================================");
            System.out.println("\n\t\t =           MAIN MENU            =\n\t\t =\t\t                  =");
            System.out.println("\t\t = Press 'P' to Play              =");
            System.out.println("\t\t = Press 'I' to Read Instructions =");
            System.out.println("\t\t = Press 'E' to Exit              =");
            System.out.println("\t\t ==================================");
            Scanner inp = new Scanner(System.in);

            // taking inputs from the user to make decision
            System.out.print("Enter Your Choice = "); 
            String option = inp.next();
            option = option.toUpperCase();          
            // assigning functions to each button in the main menu
            switch (option){
                case "E" :
                    System.out.print("Do you really want to exit the game ?(Yes or No) = ");
                    String confirm = inp.next();
                    if (confirm.equalsIgnoreCase("yes")){
                        System.out.println("Hope You Enjoyed !\n\tThanks for playing this game.");
                        System.exit(0);
                    }
                case "I" :
                    System.out.println("\t\tIn order to win the game you need know the rules of this game :-");
                    System.out.println("\t\tRULE NO.1 - If Rock V/S Paper - Paper wins");
                    System.out.println("\t\tRULE NO.2 - If Scissor V/S Paper - Scissor wins");
                    System.out.println("\t\tRULE NO.3 - If Rock V/S Scissor - Rock Wins");
                    System.out.println("\t\tRULE NO.4 - You need to score 3 points to win");
                    System.out.println("\t\tThis game is an open source game, you can change the code of this game if\n\t\tyou are good at your programming skills but it is not recommended.");    
                    break;
                case "P":
                    System.out.println("\t\tTip : SCORE 3 POINTS TO WIN !\n");
                    int round = 1;
                    int roundNo = 1;
                    // initializing points for computer & user
                    int compPoints = 0;
                    int userPoints = 0;
                    
                    // code below is for game logic
                    while (round<=4){
                        System.out.println("\t\t=========================");
                        System.out.println("\t\t=        ROUND "+roundNo+"        =\n\t\t=                       =");
                        Scanner sc = new Scanner(System.in);
                        
                        // designing game controls menu
                        System.out.println("\t\t= Press 'R' for Rock    =");
                        System.out.println("\t\t= Press 'S' for Scissor =");
                        System.out.println("\t\t= Press 'P' for Paper   =");
                        System.out.println("\t\t=========================");
                        
                        // taking user's choice
                        System.out.print("Enter Your Choice = ");
                        String userNo = sc.next();
                        if (!(userNo.equalsIgnoreCase("R") || userNo.equalsIgnoreCase("S") || userNo.equalsIgnoreCase("P"))){
                            System.out.println("INVALID INPUT.\nPlease Try Again.");
                            continue;
                        }
                        
                        // code for computer's choice
                        int randNo = ra.nextInt(3);
                        String compNo = "";
                        switch (randNo){
                            case 0 -> compNo = "R";
                            case 1 -> compNo = "S";
                            case 2 -> compNo = "P";
                        }
                        
                        // logic for win, lose & tie
                        if (compNo.equals("R") && userNo.equalsIgnoreCase("P")){
                            userPoints+=1;
                            System.out.println("\t\t\t\tComputer Points - "+compPoints);
                            System.out.println("\t\t\t\tYour Points - "+userPoints);
                            System.out.println("You have won this round !");
                            System.out.println("\nComputer Chose - Rock");
                            System.out.println("You Chose - Paper");
            
                        }
                        else if (compNo.equals("P") && userNo.equalsIgnoreCase("R")){
                            compPoints+=1;
                            System.out.println("\t\t\t\tComputer Points - "+compPoints);
                            System.out.println("\t\t\t\tYour Points - "+userPoints);
                            System.out.println("You have lost this round !");
                            System.out.println("\nComputer Chose - Paper");
                            System.out.println("You Chose - Rock");
                        }
        
                        else if (compNo.equals("P") && userNo.equalsIgnoreCase("S")){
                            userPoints+=1;
                            System.out.println("\t\t\t\tComputer Points - "+compPoints);
                            System.out.println("\t\t\t\tYour Points - "+userPoints);
                            System.out.println("You have won this round !");
                            System.out.println("\nComputer Chose - Paper");
                            System.out.println("You Chose - Scissor");
                        
                        }
                        else if (compNo.equals("S") && userNo.equalsIgnoreCase("P")){
                            compPoints+=1;
                            System.out.println("\t\t\t\tComputer Points - "+compPoints);
                            System.out.println("\t\t\t\tYour Points - "+userPoints);
                            System.out.println("You have lost this round !");
                            System.out.println("\nComputer Chose - Scissor");
                            System.out.println("You Chose - Paper");
                        }
        
                        else if (compNo.equals("S") && userNo.equalsIgnoreCase("R")){
                            userPoints+=1;
                            System.out.println("\t\t\t\tComputer Points - "+compPoints);
                            System.out.println("\t\t\t\tYour Points - "+userPoints);
                            System.out.println("You have won this round !");
                            System.out.println("\nComputer Chose - Scissor");
                            System.out.println("You Chose - Rock");
                        
                        }
                        else if (compNo.equals("R") && userNo.equalsIgnoreCase("S")){
                            compPoints+=1;
                            System.out.println("\t\t\t\tComputer Points - "+compPoints);
                            System.out.println("\t\t\t\tYour Points - "+userPoints);
                            System.out.println("You have lost this round !");
                            System.out.println("\nComputer Chose - Rock");
                            System.out.println("You Chose - Scissor");
                        }
        
                        else if (compNo.equalsIgnoreCase(userNo)){
                            System.out.println("\t\t\t\tComputer Points - "+compPoints);
                            System.out.println("\t\t\t\tUser Points - "+userPoints);
                            System.out.println("This round is Tie !\nTry Again.");
                            if (compNo.equalsIgnoreCase("r") && userNo.equalsIgnoreCase("r")){
                                System.out.println("\nComputer Chose - Rock");
                                System.out.println("You Chose - Rock");
                                roundNo++;
                                continue;
                            }
                            
                            else if (compNo.equalsIgnoreCase("s") && userNo.equalsIgnoreCase("s")){
                                System.out.println("\nComputer Chose - Scissor");
                                System.out.println("You Chose - Scissor");
                                roundNo++;
                                continue;
                            }
                            else if (compNo.equalsIgnoreCase("p") && userNo.equalsIgnoreCase("p")){
                                System.out.println("\nComputer Chose - Paper");
                                System.out.println("You Chose - Paper");
                                roundNo++;
                                continue;
                            }  
                        }
                        // if anyone score 3 points first he wins
                        if (compPoints==3 || userPoints==3){
                        break;
                        }     
                round++;
                roundNo++;
            // code for game logic ends            
            }
        
                    // Final Decision (Win,Lose or Tie)
                    if (compPoints>userPoints){
                        System.out.println("ALAS ! YOU HAVE LOST THE MATCH.");
                    }
                    else if (userPoints>compPoints){
                        System.out.println("HOORAY ! YOU HAVE WON THE MATCH.");
                    }
                    else if (userPoints==compPoints){
                        System.out.println("Oh ! This match is a tie.\nPlay Again");
                    }
                    


                break;
                default :
                    System.out.println("INVALID INPUT.");    
                }
        
            }
            // Code for main menu ends here
        }
}