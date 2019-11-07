package Game.Army;
import Game.Piece.*;
public class Army40 {
    private Pieces[] army;
    public Pieces[] createArmy(){
        army = new Pieces[40];
        army[0] = new Pieces("Flag",0);
        for (int i = 1; i <= 6; i++) {
            army[i] = new Pieces("Bomb",-1);
        }
        army[7] = new Pieces("Spy",1);
        for (int i = 8; i <= 16; i++) {
            army[i] = new Pieces("Scout",2);
        }
        for (int i = 16; i <= 21; i++) {
            army[i] = new Pieces("Miner",3);
        }
        for (int i = 21; i <= 24; i++) {
            army[i] = new Pieces("Sergeant",4);
        }
        for (int i = 25; i <= 28; i++) {
            army[i] = new Pieces("Lieutenant",5);
        }
        for (int i = 29; i <= 32; i++) {
            army[i] = new Pieces("Captain",6);
        }
        for (int i = 33; i <= 35; i++) {
            army[i] = new Pieces("Major",7);
        }
        for (int i = 36; i <= 37; i++) {
            army[i] = new Pieces("Colonel",8);
        }
        army[38
                ] = new Pieces("General",9);
        army[39] = new Pieces("Marshall",10);
        return army;
    }
    public Pieces[] getArmy(){
        return army;
    }
    public String toString(){
        StringBuilder temp = new StringBuilder();
        for (Pieces pieces : army) {
            temp.append(pieces);
        }
        return temp.toString();
    }
}
