package Game.Piece;
public class Flag extends Pieces{
    public Flag(){
        super("Flag",-1);
    }
    public String toString(){
        return getClass() +
                "\n\t{name=" + getName() + "}" +
                "\n\t{pieceId=" + getPieceId() + "}";
    }
}
