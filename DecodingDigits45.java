import java.util.*;
public class DecodingDigits45 
{
    public static int decoding_digits(char[] digits, int n)
    {
        int count[]=new int[n+1];
        count[0]=1;
        count[1]=1;
        int i;
        for(i=2;i<=n;i++)
        {
            count[i]=0;
            count[i]=count[i-1];

            if(digits[i-2]=='1' || (digits[i-2]=='2' && digits[i-1]<'7'))
            {
                count[i]=count[i]+count[i-2];
            }
        }
        return count[n];
    }
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int num, len=0;
        System.out.println("Enter a Number to Decode:");
        num=in.nextInt();
        String str=Integer.toString(num);
        //len=str.length();
        char digits[]=str.toCharArray();
        len=digits.length;
        System.out.println("The Decoded Form is:");
        System.out.println(decoding_digits(digits,len));
    }
}