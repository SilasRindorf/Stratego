package Game.Piece;
public class Pieces {
    private String name;
    private int pieceId;
    private boolean dead;
    private int moves;
    public Pieces(String name, int pieceId){
        this.name = name;
        this.pieceId = pieceId;
        if (pieceId == 1)
            moves = 40;
        else
            moves = 1;
    }
    public void setDead(){
        this.dead = true;
    }
    public boolean isDead() {
        return dead;
    }
    public String getName(){
        return name;
    }
    public int getPieceId(){
        return pieceId;
    }
    public int getMoves(){
        return moves;
    }
    public String toString(){
        return "\nClass Pieces" +
                "\n\t{name=" + getName() + "}" +
                "\n\t{pieceId=" + getPieceId() + "}";
    }
}