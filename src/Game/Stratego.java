package Game;
import Game.Army.Army40;
import Game.Piece.Pieces;

public class Stratego {
    public void startGame(){
        Army40 army = new Army40();
        army.createArmy();
        System.out.println(army);
    }
}
