import java.util.*;
public class NumberOfDigits48
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        int d=0,num,num1=0,count=0;
        System.out.println("Enter a Number:");
        num=in.nextInt();
        num1=num;
        while(num1>0)
        {
            d=num1%10;
            count++;
            num1=num1/10;
        }
        if(count>0)
        {
            System.out.println("Number of Digits in the Number "+num+" is: "+count);
        }
    }
}