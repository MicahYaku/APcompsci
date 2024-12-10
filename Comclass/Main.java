package Comclass;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
    Player player01 = new Player();
    
    Scanner scan = new Scanner(System.in);
    String numAct = scan.nextLine();

        if (numAct.substring(0,2).equals(01))
        {
            if(numAct.substring(numAct.length()-1).equals("b"))
            {
                Player.setB(1);
            }
    }

    public class Player 
    {
        
        private int kills;
        private int blocks;
        
        public Player()
        {
            kills = 0;
            blocks = 0;
        }
    
        public Player(int fkills, int fBlocks)
        {
            kills = fkills;
            blocks = fBlocks;
        }
        
        public void setB(int aBlocks)
        {
            blocks =+ aBlocks;
        }
    
}
