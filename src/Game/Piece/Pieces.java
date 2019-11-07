package Game.Piece;
public class Pieces {
    private String name;
    private int pieceId;
    private boolean dead;
    public Pieces(String name, int pieceId){
        this.name = name;
        this.pieceId = pieceId;
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
}
