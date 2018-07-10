import java.util.*;

public class First{
    Character[][] ticTacToe = new Character[3][3];

    public First() {
        for (int i = 0; i < ticTacToe.length ; i++) {
            for (int j = 0; j < ticTacToe[i].length; j++) {
                ticTacToe[i][j] = '-';
            }
        } 
    }

    // public void printBoard() {
    //     for (int i = 0 ; i < this.ticTacToe.length ; i++ ) {
    //         extracted();
    //     }
    // }

    public static void main(String[] args) {
        // First board = new First();
        // board.printBoard();
        // for (c in xrange(5)) {
        //     System.out.println(c);
        // }
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        Set<Integer> countSet = new HashSet<Integer>();
        countSet.add(1);
        countSet.add(2);
        countSet.add(1);
        countSet.add(3);
        for (int i : countSet) {
            System.out.println(i);
        }
        
    }
}
