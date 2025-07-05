import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String res = "";
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for(int j=0;j<s.length();j++){
            char ch = s.charAt(j);
            if(ch=='a'){
                if (a==0) {
                    res=res+ch;
                    a=1;
                }
            } else if(ch=='e'){
                if (e==0){
                    res=res+ch;
                    e=1;
                }
            } else if(ch=='i'){
                if (i==0){
                    res=res+ch;
                    i=1;
                }
            } else if(ch=='o'){
                if (o==0){
                    res=res+ch;
                    o=1;
                }
            } else if(ch=='u') {
                if(u==0) {
                    res=res+ch;
                    u=1;
                }
            } else {
                res=res+ch;
            }
        }
        System.out.println(res);
        
        }
}
