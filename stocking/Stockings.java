package stocking;
public class Stockings 
{
    private String owner;
    private int itemCount;
    private int idNum;
    
    private static int stockingCount = 0;

    public Stockings()
    {
        owner = "";
        itemCount = 0;
        stockingCount ++;
        idNum = stockingCount;
    }
    
    public Stockings(String owner1, int itemCount1)
    {
        owner = owner1;
        itemCount = itemCount1;
        stockingCount ++;
        idNum = ++ stockingCount;
    }

    public int getItemCount()
    {
        return itemCount;
    }

    public String getOwner()
    {
        return owner;
    }

    public int getId()
    {
        return idNum;
    }

    public String toString()
    {
        return "\nOwner: "+owner+"\nitemCount: "+itemCount+"\nidNum: "+idNum+"\n";
    }

}

class StockingTest
{
    public static void main(String[] args)
    {
        Stockings s1 = new Stockings();
        Stockings s2 = new Stockings("john", 4);

        System.out.print(s2.toString());
    }
}
