public class Chess {
    private static String[][] board = new String[][]{
            { "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002"},
            { "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002"},
            { "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002"},
            { "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002"},
            { "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002"},
            { "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002"},
            { "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002"},
            { "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002", "\u2002"}

    };
    private static void printBoard() {
        System.out.println("  _A_B_C_D_E_F_G_H_");
        int boardNums = 8;
        for(int i = 0; i < 8; i++) {
            System.out.printf("%s |", boardNums);
            for(int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
                System.out.print(" ");
            }
            System.out.printf("| %s", boardNums);
            boardNums--;
            System.out.println();
    }
        System.out.println("  _ _ _ _ _ _ _ _ _");
        System.out.println("   A B C D E F G H");


    }
    public static void main(String[] args) {
        Piece player = new Piece();
        resetBoard(player);
        printBoard();

    }

    private static void resetBoard(Piece player){


        // SET WHITE PIECES FOR INITIAL GAMEBOARD
        // set pawns
        for (int j = 0; j < 8; j++) {
            board[1][j] = player.choosePiece("pawn", "white");
        }

        //set rooks
        for (int k = 0; k < 8; k +=7) {
            board[0][k] = player.choosePiece("rook", "white");
        }

        // set bishops
        for (int k = 1; k < 8; k +=5) {
            board[0][k] = player.choosePiece("bishop", "white");
        }

        // set knights
        for (int k = 2; k < 8; k +=3) {
            board[0][k] = player.choosePiece("knight", "white");
        }
        board[0][3] = player.choosePiece("queen", "white");
        board[0][4] = player.choosePiece("king", "white");

        // SET Black PIECES FOR INITIAL GAMEBOARD
        for (int j = 0; j < 8; j++) {
            board[6][j] = player.choosePiece("pawn", "black");
        }
        //set rooks
        for (int k = 0; k < 8; k +=7) {
            board[7][k] = player.choosePiece("rook", "black");
        }

        // set bishops
        for (int k = 1; k < 8; k +=5) {
            board[7][k] = player.choosePiece("bishop", "black");
        }

        // set knights
        for (int k = 2; k < 8; k +=3) {
            board[7][k] = player.choosePiece("knight", "black");
        }
        board[7][3] = player.choosePiece("queen", "black");
        board[7][4] = player.choosePiece("king", "black");
    }
}


