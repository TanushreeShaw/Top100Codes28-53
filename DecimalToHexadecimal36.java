import java.util.*;
public class DecimalToHexadecimal36 
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int dec=0,i=0,d=0,j;
        char hex[]=new char[20];
        System.out.println("Enter a Decimal Number:");
        dec=in.nextInt();
        while(dec>0)
        {
            d=dec%16;

            if(d<10)
            {
                hex[i]=(char)(d+48);
                i++;
            }
            else
            {
                hex[i]=(char)(d+55);
                i++;
            }
            dec=dec/16;
        }
        
        System.out.println("Binary Equivalent:");
        for(j=i-1;j>=0;j--)
        {
            System.out.print(hex[j]);
        }
    }
}
