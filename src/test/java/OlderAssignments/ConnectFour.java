package OlderAssignments;

import java.util.Scanner;

public class ConnectFour {
    //static ConnectFourPiece[][] board = new ConnectFourPiece[6][6];//The first number represents [row] and the second represents [column]
    static char[][] board = new char[6][6];//The first number represents [row] and the second represents [column]

    /*[[0,0,0,0,0,0,0],
       [0,0,0,0,0,0,0],
       [0,0,0,0,0,0,0],
       [0,0,0,0,0,0,0],
       [0,0,0,0,0,0,0],
       [0,0,0,0,0,0,0],
       [0,0,0,0,0,0,0]]
     */

    //TODO replace chars, fill add piece function, make routine for test.

    ConnectFour(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='0';
            }
        }
    }

    void AddPiece(){

    }

    String HorizontalWin(){
        String endState = "No contest";
        //ConnectFourPiece prevPiece = new ConnectFourPiece();//Variable used to keep track of the previous piece
        char prevPiece = '0';
        int redStreakCounter = 0;
        int blackStreakCounter = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(prevPiece == board[i][j] && prevPiece== 'R'){
                    redStreakCounter++;
                }
                else if(prevPiece == board[i][j] && prevPiece == 'B'){
                    blackStreakCounter++;
                }
                prevPiece = board[i][j];//The index is moved forward one.
            }
            if (redStreakCounter > 3){
                endState = "Red wins";
            }
            else if (blackStreakCounter > 3){
                endState = "Black wins";
            }
            redStreakCounter = 0;
            blackStreakCounter = 0;
        }

        return endState;
    }

    String VerticalWin(){
        String endState = "No contest";
        //ConnectFourPiece prevPiece = new ConnectFourPiece();//Variable used to keep track of the previous piece
        char prevPiece = '0';
        int redStreakCounter = 0;
        int blackStreakCounter = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(prevPiece == board[j][i] && prevPiece == 'R'){
                    redStreakCounter++;
                }
                else if(prevPiece == board[j][i] && prevPiece == 'B'){
                    blackStreakCounter++;
                }
                prevPiece = board[j][i];//The index is moved forward one.
            }
            if (redStreakCounter > 3){
                endState = "Red wins";
            }
            else if (blackStreakCounter > 3){
                endState = "Black wins";
            }
            redStreakCounter = 0;
            blackStreakCounter = 0;
        }

        return endState;
    }

//
//    static void PrintBoard(char [][] board){
//        for (int i = board.length; i < 0; i--) {
//            for (int j = 0; j < board.length; j++) {
//                System.out.print(board[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        char[][] board = new char[6][6];
//
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                board[i][j] = '.';
//            }
//        }
//
//        Scanner scan = new Scanner(System.in);
//
//        PrintBoard(board);
//    }
}
