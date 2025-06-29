import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean changed=true;
        while (changed){
            changed = false;
            String result = "";
            int i = 0;
            while (i < s.length()) {
                if (i < s.length()-1&& s.charAt(i) == s.charAt(i + 1)){
                    i += 2;
                    changed = true;
                } else {
                    result=result+s.charAt(i);
                    i++;
                }
            }
            s=result;
        }
        if(s.equals("")){
            System.out.println("Empty String");
        } else {
            System.out.println(s);
        }
    }
}