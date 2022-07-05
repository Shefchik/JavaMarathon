package day17;

public class ChessBoard {
    private final ChessPiece[][] chessBoard;

    public ChessBoard(ChessPiece[][] chessBoard){
        this.chessBoard = chessBoard;
    }

    public void print(){
        for (ChessPiece[] chessPieces : chessBoard) {
            for (ChessPiece chessPiece : chessPieces) {
                System.out.print(chessPiece.getName());
            }
            System.out.println();
        }
    }
}
