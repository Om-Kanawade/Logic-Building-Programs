public class Palindrome {

    public static void main(String args[]){
    int number=345;
   int  temp=number;
   int rem=0;
   int rev=0;

    while(temp>0 ){

        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;


    }

     System.out.println(rev);



    }
    
  

    
}
