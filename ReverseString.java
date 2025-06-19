
import java.util.*;
public class ReverseString {
public static void main(String[] args) {
    
   

String str="OMII";
StringBuffer bf=new StringBuffer(str);
System.out.println(bf.reverse());


str="prashant";

String rev="";


for(int i=str.length()-1;i>=0;i--)
{

    rev=rev+str.charAt(i);
}

System.out.println(rev);

// Palindrome check
        if (str.equals(rev)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
} 
    
}
