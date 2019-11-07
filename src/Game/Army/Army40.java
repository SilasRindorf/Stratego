package Game.Army;
import Game.Piece.*;

public class Army40 {
    public Army40(){
        Pieces[] army = new Pieces[40];
        army[0] = new Flag();
        for (int i = 1; i <= 6; i++) {
            army[i] = new Bomb();
        }
        army[7] = new Scout();
        for (int i = 8; i < 16; i++) {
            //army[i] = new Miner();

            //Why tf does no wark
        }
        for (int i = 0; i < army.length; i++) {
            System.out.println(army[i]);
        }
    }
}
