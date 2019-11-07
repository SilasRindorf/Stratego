package Game.Piece;
public class Bomb extends Pieces{
    public Bomb(){
        super("Bomb",0);
    }
    public String toString(){
        return getClass() +
                "\n\t{name=" + getName() + "}" +
                "\n\t{pieceId=" + getPieceId() + "}";
    }
}
