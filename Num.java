import java.io.*;
import java.util.*;
class Num
{
 public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       int i=0;
        int a=scan.nextInt();
       while(a>0)
       {
           a=a/10;
           i++;
       }
      
        System.out.println(i);
        
    }
    
}
