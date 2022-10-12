import java.util.*;
public class Quadrants39
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the Value of X:");
        x=in.nextInt();
        System.out.println("Enter the Value of Y:");
        y=in.nextInt();
        
        if(x>0 && y>0)
            System.out.println("First Quadrant.");
        else if(x<0 && y>0)
            System.out.println("Second Quadrant.");
        else if(x<0 && y<0)
            System.out.println("Third Quadrant.");
        else if(x>0 && y<0)
            System.out.println("Fourth Quadrant.");
        else if(x!=0 && y==0)
            System.out.println("X-Axis.");
        else if(x==0 && y!=0)
            System.out.println("Y-Axis.");
        else
        System.out.println("Origin.");
    }
}