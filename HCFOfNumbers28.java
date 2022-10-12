import java.util.*;
public class HCFOfNumbers28
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int num1,num2,i,gcd=0;
        System.out.println("Enter Two Numbers:");
        num1=in.nextInt();
        num2=in.nextInt();
        for(i=1;i<=num1 || i<=num2;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                gcd=i;
            }
        }
        System.out.println("GCD of Two Numbers: "+gcd);
    }
}