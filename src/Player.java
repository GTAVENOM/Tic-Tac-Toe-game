public class Player {
    public static final int HUMAN=0;
    public static final int AI=1;
    private final String move;
    private final int type;
    public Player(String player,int isAI){
        this.move =player;
        this.type=isAI;
    }
    public String getMove(){
        return this.move;
    }
}