import java.util.Scanner;
import java.util.ArrayList;

public class Polygon
{

    private String name;
    private int sidesN;

    public Polygon()
    {
        // System.out.println("Polygon");
        sidesN = 0;
        name = "Polygon";
    }

    public Polygon(String name, int sidesN)
    {
        // System.out.println("Polygon");
        this.sidesN = sidesN;
        this.name = name;
    }

    public static void main(String[] args)
    {
        
        Polygon p1 = new Polygon();
        Triangle t1 = new Triangle(1, 2, 3);
        Triangle et1 = new ETriangle(1);
        Square s1 = new Square(2);
        // System.out.println(t1.toString());
        // System.out.println(et1.toString());
        // System.out.println(s1.toString());

        Polygon p2 = new Triangle(1,2,3);
        ArrayList<Polygon> shapes = new ArrayList<Polygon>();
        shapes. add(p1);
        shapes.add(et1);
        shapes.add(t1);
        shapes.add(s1);
        shapes.add(p2);
        for(Polygon p: shapes)
            System.out.println(p);

        System.out.println(s1.compareSides(t1));
    }

    public String getName()
    {
        return name;
    }

    public int getSides()
    {
        return sidesN;
    }

    public String toString()
    {
        if(!this.getName().equals("Triangle"))
            return "Shape: " + name + "\nSides: " + sidesN + "\n";
        else
            return "Shape: " + name + "\nSides: " + sidesN;
    }

    public String compareSides(Polygon pa)
    {
        if(this.getSides() > pa.getSides())
        return this.getName() + " has more sides than " + pa.getName();

        else
        {
        return pa.getName() + " has more sides than " + this.getName();
        }
        
        return pa.getName() + " has same sides as " + this.getName();
    }
}

class Triangle extends Polygon
{

    private int[] sides = new int[3];
    public Triangle(int s1, int s2, int s3)
    {
        // System.out.println("Polygon");
        super("Triangle", 3);
        sides[0] = s1;
        sides[1] = s2;
        sides[2] = s3;

    }

    public Triangle()
    {
        super("Triangle", 0);
    }

    public String toString()
    {

        return super.toString() + "\nSidelenthgs: " + sides[0] + ", "+ sides[1] + ", "+ sides[2] + "\n";

    }

}

class ETriangle extends Triangle
{

    private int side;
    public ETriangle(int s1)
    {
        // System.out.println("Polygon");
        super(s1, s1, s1);
        side = s1;

    }

    public ETriangle()
    {
        super(0,0,0);
    }

}

class Square extends Polygon

{

    private int side;

    public Square(int s1)
    {
        // System.out.println("Polygon");
        super("Square", 4);
        side = s1;

    }

    public Square()
    {
        super("Square", 0);
    }

}