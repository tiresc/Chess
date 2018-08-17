public class Piece {
    private String pieceName;
    private String choice;
   String choosePiece(String pieceName, String color){
       switch(color + " " +pieceName)

       {
           // White pieces
           case "white king":
               return "\u2654";
           case "white queen":
               return "\u2655";
           case "white rook":
              return "\u2656";
           case "white bishop":
               return "\u2657";
           case "white knight":
               return "\u2658";
           case "white pawn":
               return "\u2659";

           // Black pieces
           case "black king":
               return "\u265A";
           case "black queen":
               return "\u265B";
           case "black rook":
               return "\u265C";
           case "black bishop":
               return "\u265D";
           case "black knight":
               return "\u265E";
           case "black pawn":
               return "\u265F";
       }

       return pieceName;
   }
}
