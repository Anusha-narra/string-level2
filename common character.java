import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        boolean flag=false;
        for(int i=0;i<s1.length();i++){
             for(int j=0;j<s2.length();j++)
                if(s1.charAt(i)==s2.charAt(j)){
                  System.out.println("Yes");
                    return;
                }
        }
                 System.out.print("No");
                
            
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}