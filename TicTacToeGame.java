import java.util.Scanner;
import java.util.Random;
public class TicTacToeGame {
    public static char[] gameBoard = new char[10];
    public static boolean is_player = true;
    public static int playerPos, compPos;
    public static char playerXO;
    public static char computerXO;
    static Scanner sc = new Scanner(System.in);

    public static void GameBoard(){
        for (int i=0; i< gameBoard.length; i++){
            gameBoard[i] = ' ';
        }
    }

    public static void choice(){
        System.out.println("Do you want X or O : ");
        playerXO = sc.next().charAt(0);

        if (playerXO == 'X') {
            computerXO = 'O';
        } else {
            computerXO = 'X';
        }
        System.out.println("Computer's Letter: "+computerXO);
    }

    public static void showBoard(){
        System.out.println("****** Current Board ******");
        System.out.println(gameBoard[1]+" | "+gameBoard[2]+" | "+gameBoard[3]);
        System.out.println(gameBoard[4]+" | "+gameBoard[5]+" | "+gameBoard[6]);
        System.out.println(gameBoard[7]+" | "+gameBoard[8]+" | "+gameBoard[9]);
    }

    public static void moveLocation(){
        if (is_player == true ){
             System.out.println("Please enter the the position you want to play(1-9): ");
             playerPos = sc.nextInt();
               if (playerPos < 1 || playerPos > 9){
                  System.out.println("This position is off the board. Play again!");
               } else if (gameBoard[playerPos] != ' ') {
                  System.out.println("Position is occupied. Try again!");
               } else {
                  System.out.println("Valid Position");
               }
               gameBoard[playerPos] = playerXO;
        }
    }

    public static void setCompPos(){
        compPos = (int) (Math.random() * 9) + 1;
        if (gameBoard[compPos] == ' '){
            gameBoard[compPos] = computerXO;
        } else {
           setCompPos();
        }
    }
    public static void turn(){
        int rand = (int) Math.floor(Math.random() * 10) % 2;
        switch (rand){
            case 1:
                System.out.println("--- Player's turn ---");
                moveLocation();
                showBoard();
            break;
            case 0:
                System.out.println("--- Computer's turn ---");
                setCompPos();
                showBoard();
            break;
            default:
                System.out.println("Try Again!");
        }
    }

    public static void main(String[] args) {
        GameBoard();
        showBoard();
        choice();
        turn();
    }
}