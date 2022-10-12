import java.util.*;
public class DecimalToBinary34 
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int dec=0,i=0,d=0,j;
        int binary[]=new int[20];
        System.out.println("Enter a Decimal Number:");
        dec=in.nextInt();
        while(dec>0)
        {
            d=dec%2;
            binary[i]=d;
            dec=dec/2;
            i++;
        }
        System.out.println("Binary Equivalent:");
        for(j=i-1;j>=0;j--)
        {
            System.out.print(binary[j]);
        }
    }
}
