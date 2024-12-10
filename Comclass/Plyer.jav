package Comclass;
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