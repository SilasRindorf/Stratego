package Game.Piece;

public class Scout extends Pieces {
    public Scout(){
        super("Scout",1);
    }
    public String toString(){
        return getClass() +
                "\n\t{name=" + getName() + "}" +
                "\n\t{pieceId=" + getPieceId() + "}";
    }
}
