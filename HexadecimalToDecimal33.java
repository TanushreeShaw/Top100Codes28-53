import java.util.*;
public class HexadecimalToDecimal33 
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);

        String digits="0123456789ABCDEF";
        String str;
        char ch='\0';
        int i,d=0;
        double hex=0.0;
        System.out.println("Enter a Hexadecimal Number:");
        str=in.nextLine();
        str=str.toUpperCase();
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            d=digits.indexOf(ch);
            hex=(hex*16)+d;
        }
        System.out.println("Decimal Equivalent of the HexaDecimal Number: "+(int)hex);
    }
}
