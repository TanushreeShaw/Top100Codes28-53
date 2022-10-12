import java.util.*;
public class BinaryToDecimal31 
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int bin=0,bin1=0,i=0,d=0;
        double decimal=0.0;
        System.out.println("Enter a Binary Number:");
        bin=in.nextInt();
        bin1=bin;
        while(bin1>0)
        {
            d=bin1%10;
            decimal=decimal+d*Math.pow(2,i);
            i++;
            bin1=bin1/10;
        }
        
        System.out.println("Decimal Equivalent of the Binary Number: "+(int)decimal);
    }
}