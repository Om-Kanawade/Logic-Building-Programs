import java.util.Scanner;
import java.util.*;

class ARRAY{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in); 
  
  System.out.println("enter the size of array");
  int n=sc.nextInt();


  int[] array1=new int[n];
  
  System.out.println("enter the array elements");
  for(int i=0;i<array1.length;i++)
  {
          array1[i]=sc.nextInt();
   
  }
//   System.out.println("this is the array elements");
//   for(int j=0;j<array1.length;j++)
//   {

//     System.out.println(array1[j]);

//   }
   

//  for(int i=0;i<array1.length;i++)
//  {

//    for(int j=i+1;j<array1.length;j++)
//    {

//       if(array1[i]>array1[j]){

//         int temp=array1[i];
//         array1[i]=array1[j];
//         array1[j]=temp;


//       }

//    }

  

   
//  }
//   for(int i=0;i<array1.length;i++)
//    {

//     System.out.print("\t"+array1[i]);
//    }

   Arrays.sort(array1);
   System.out.println("sorted array is ");
   for(int i=0;i<array1.length;i++)
   {
   System.out.print("\t"+array1[i]);
   }

  sc.close();
}
 

}