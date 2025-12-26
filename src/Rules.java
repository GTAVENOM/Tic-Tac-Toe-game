public class Rules {
    private static int[][] winCondition= {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    public static int checkWin(Board board){
        int[] tempBoard = board.getboard();
        for(int[] win: winCondition){
            int a=win[0];
            int b=win[1];
            int c=win[2];
            if(tempBoard[a]!=-1 && tempBoard[b]==tempBoard[a] && tempBoard[c]==tempBoard[b]){
                return tempBoard[a];
            }
        }
        return -1;
    }
    public static boolean checkDraw(Board board){
        int[] tempBoard = board.getboard();
        for (int j : tempBoard) {
            if (j == -1) {
                return false;
            }
        }
        return true;
    }
}
