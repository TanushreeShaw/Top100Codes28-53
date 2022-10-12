import java.util.*;
public class OctalToDecimal32
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int oct=0,oct1=0,i=0,d=0;
        double decimal=0.0;
        System.out.println("Enter an octal Number:");
        oct=in.nextInt();
        oct1=oct;
        while(oct1>0)
        {
            d=oct1%10;
            decimal=decimal+d*Math.pow(8,i);
            i++;
            oct1=oct1/10;
        }
        
        System.out.println("Decimal Equivalent of the Octal Number: "+(int)decimal);
    }
}