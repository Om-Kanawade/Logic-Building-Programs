import java.util.*;
public class Armstrong {

   static  Scanner sc=new Scanner(System.in);

    public static void main(String []args )
    {
        System.out.println("enter the number ");

        int number=sc.nextInt();

        String str=String.valueOf(number);
        int count=str.length();
        int temp=number;
        int sum=0;
        while(temp> 0){

            int digit=temp%10;
            temp=temp/10;

            int digit2=1;
            for(int i=0;i<count;i++)
            {  digit2=digit2*digit;

            }
        
           sum=sum+digit2;
        }
        
        if(sum==number)
        {   System.out.println(sum);
            System.out.println("this is armstrong number ");

        }
        else 
        {  
            System.out.println(sum);
            System.out.println("this number is not armstrong number");
        }
        
    }
    
}
