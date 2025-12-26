import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board b1 = new Board();
        Player p1=new Player("X");
        Player p2=new Player("O");
        b1.drawBoard();
        gameState(b1,p1,p2);
    }
    public static void gameState(Board b1, Player p1, Player p2){
        Scanner input=new Scanner(System.in);
        while(!Rules.checkDraw(b1) && (Rules.checkWin(b1)==-1)){
            int num;
            do{
                System.out.print("Enter number 0 to 8: ");
                num = input.nextInt();
            }while(b1.captureMove(p1, num));
            b1.drawBoard();
            if(Rules.checkDraw(b1) || (Rules.checkWin(b1)!=-1)){
                break;
            }
            do{
                System.out.print("Enter number 0 to 8: ");
                num = input.nextInt();
            }while(b1.captureMove(p2, num));
            b1.drawBoard();
        }
        if(Rules.checkDraw(b1)){
            System.out.println("Draw!");
        }
        if(Rules.checkWin(b1)==1){
            System.out.println("X Wins!");
        }
        else  if(Rules.checkWin(b1)==0){
            System.out.println("O Wins!");
        }
    }
}