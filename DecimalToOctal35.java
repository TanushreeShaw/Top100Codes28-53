import java.util.*;
public class DecimalToOctal35 
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int dec=0,i=0,d=0,j;
        int octal[]=new int[20];
        System.out.println("Enter a Decimal Number:");
        dec=in.nextInt();
        while(dec>0)
        {
            d=dec%8;
            octal[i]=d;
            dec=dec/8;
            i++;
        }
        System.out.println("Octal Equivalent:");
        for(j=i-1;j>=0;j--)
        {
            System.out.print(octal[j]);
        }
    }
}
