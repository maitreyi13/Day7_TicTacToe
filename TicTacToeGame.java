import java.util.Scanner;
public class TicTacToeGame {
    public static char[] gameBoard = new char[10];
    static Scanner sc = new Scanner(System.in);

    public static void TicTacToeGame(){
        for (int i=0; i< gameBoard.length; i++){
            gameBoard[i] = ' ';
        }
    }

    public static char choice(){
        System.out.println("Do you want X or O : ");
        return sc.next().charAt(0);

    }

    public static void showBoard(){
        System.out.println("****** Current Board ******");
        System.out.println(gameBoard[1]+" | "+gameBoard[2]+" | "+gameBoard[3]);
        System.out.println(gameBoard[4]+" | "+gameBoard[5]+" | "+gameBoard[6]);
        System.out.println(gameBoard[7]+" | "+gameBoard[8]+" | "+gameBoard[9]);
    }

    public static void main(String[] args) {
        TicTacToeGame();
        choice();
        showBoard();
    }
}