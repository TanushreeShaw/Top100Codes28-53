import java.util.*;
public class LCMOfNumbers29 
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);

        int num1,num2,i,lcm=0,max=0,p=0;
        System.out.println("Enter Two Numbers:");
        num1=in.nextInt();
        num2=in.nextInt();
        max=(num1>num2)?num1:num2;
        for(i=max;i<=num1*num2;i++)
        {
            if(i%num1==0 && i%num2==0)
            {
                lcm=i;
                break;
            }
        }
        System.out.println("GCD of Two Numbers: "+lcm);
    }
    
}
