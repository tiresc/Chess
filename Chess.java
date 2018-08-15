import java.util.Arrays;

public class Chess {
    static int[][] board = new int[][]{
            { 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0, 0, 0, 0}

    };
    public static void main(String[] args) {
        int boardNums = 8;
       // System.out.println("   A B C D E F G H");
        System.out.println("  _A_B_C_D_E_F_G_H_");
        for(int i = 0; i < 8; i++) {
            System.out.printf("%s |", boardNums);
            boardNums--;
            for(int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.print("\u2654");System.out.printf(" White King\n");
        System.out.print("\u2655");System.out.print(" White Queen\n");
        System.out.print("\u2656");System.out.print(" White Rook\n");
        System.out.print("\u2657");System.out.print(" White Bishop\n");
        System.out.print("\u2658");System.out.print(" White Knight \n");
        System.out.print("\u2659");System.out.print(" White Pawn\n");
        System.out.print("\u265A");System.out.printf(" Black King\n");
        System.out.print("\u265B");System.out.print(" Black Queen\n");
        System.out.print("\u265C");System.out.print(" Black Rook\n");
        System.out.print("\u265D");System.out.print(" Black Bishop\n");
        System.out.print("\u265E");System.out.print(" Black Knight \n");
        System.out.print("\u265F");System.out.print(" Black Pawn\n");


    }
}
