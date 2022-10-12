import java.util.*;
public class BinaryToOctal37
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int bin=0,bin1=0,i=0,j=0,k,d=0,dec=0;
        double decimal=0.0;
        int octal[]=new int[20];
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

        dec=(int)decimal;
        while(dec>0)
        {
            d=dec%8;
            octal[j]=d;
            dec=dec/8;
            j++;
        }
        System.out.println("Octal Representation:");
        for(k=j-1;k>=0;k--)
        {
            System.out.print(octal[k]);
        }
    }
}