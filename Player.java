public class Player 
{
    
    private static int[] plyr = new int[2];
    
    public Player()
    {
        plyr[1] = 0;
        plyr[2] = 0;
    }

    public Player(int fkills, int fBlocks)
    {
        plyr[1] = fkills;
        plyr[2] = fBlocks;
    }
    
    public void setB(int aBlocks)
    {
        plyr[2] =+ aBlocks;
    }

    public void setK(int aKills)
    {
        plyr[1] =+ aKills;
    }

}