package Game.Piece;
public class Sergeant extends Pieces {
    public Sergeant(){
        super("Sergeant",2);
    }
    public String toString(){
        return getClass() +
                "\n\t{name=" + getName() + "}" +
                "\n\t{pieceId=" + getPieceId() + "}";
    }
}
