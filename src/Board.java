public class Board {
    private int[] board;
    public Board() {
        board=new int[9];
        for(int i=0;i<9;i++){
            this.board[i]=-1;
        }
    }
    public int[] getboard(){
        return this.board;
    }

    public void drawBoard() {
        int k=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (this.board[k]) {
                    case -1:
                        System.out.print("    +");
                        break;
                    case 0:
                        System.out.print("    O");
                        break;
                    case 1:
                        System.out.print("    X");
                        break;
                    default:
                        System.out.print("    ?");
                        break;
                }
                k++;
            }
            System.out.println();
        }
    }

    public boolean captureMove(Player player, int num){
        if(num<0 || num>8){
            System.out.println("Invalid input");
            return true;
        }
        else if(board[num]!=-1){
            System.out.println("Move is already captured");
            return true;
        }
        else{
            if(player.getMove().equals("X")){
                board[num]=1;
            }
            else{
                board[num]=0;
            }
            return false;
        }
    }
}