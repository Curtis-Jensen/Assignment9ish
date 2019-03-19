package OlderAssignments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConnectFourTest {
    @Test
    void HorizontalTest(){
        OlderAssignments.ConnectFour game = new OlderAssignments.ConnectFour();
//        for (int i = 0; i < game.board.length; i++) {
//            for (int j = 0; j < game.board.length; j++) {
//                game.board[i][j].color = '0';
//            }
//        }
        assertEquals("No contest", game.HorizontalWin());

        //game.board = new ConnectFourPiece[6][6];
        for (int i = 0; i < game.board.length; i++) {//Making all the bottom pieces red
            System.out.println(game.board[0][i]);
            game.board[0][i]='R';
        }
        //assertEquals("Red wins", game.HorizontalWin());

        for (int i = 0; i < game.board.length; i++) {//Making all the first column black,
            game.board[i][0] = 'B';
        }
        assertEquals("Black wins", game.VerticalWin());
    }

    @Test
    void VerticalTest(){

    }
}
