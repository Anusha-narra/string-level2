import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int k=in.nextInt();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
         char newChar=(char) ((ch-'a'+k)%26+'a');
        result.append(newChar);
        }
        System.out.print(result.toString());
    }
}