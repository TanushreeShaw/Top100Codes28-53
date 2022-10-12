import java.util.*;
public class OctalToBinary38
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int oct1=0,oct,i=0,j=0,k,d=0,dec=0;
        double decimal=0.0;
        int binary[]=new int[20];
        System.out.println("Enter an Octal Number:");
        oct=in.nextInt();
        oct1=oct;
        while(oct1>0)
        {
            d=oct1%10;
            decimal=decimal+d*Math.pow(8,i);
            i++;
            oct1=oct1/10;
        }
        
        dec=(int)decimal;
        while(dec>0)
        {
            d=dec%2;
            binary[j]=d;
            dec=dec/2;
            j++;
        }

        for(k=j-1;k>=0;k--)
        {
            System.out.print(binary[k]);
        }
    }
}