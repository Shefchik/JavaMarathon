package day17;

public enum ChessPiece {
    KING_WHITE(100, "Король (белый)"), KING_BLACK(100, "Король (черный)"),
    QUEEN_WHITE(9, "Ферзь (белый)"), QUEEN_BLACK(9, "Ферзь (черный)"),
    ROOK_WHITE(5, "Ладья (белый)"), ROOK_BLACK(5, "Ладья (черный)"),
    BISHOP_WHITE(3.5, "Слон (белый)"), BISHOP_BLACK(3.5, "Слон (черный)"),
    KNIGHT_WHITE(3, "Конь (белый)"), KNIGHT_BLACK(3, "Конь (черный)"),
    PAWN_WHITE(3, "Пешка (белый)"), PAWN_BLACK(3, "Пешка (черный)"),
    EMPTY(-1, "_");

    private final double figureValue;
    private final String name;

    ChessPiece(double figureValue, String name){
        this.figureValue = figureValue;
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
