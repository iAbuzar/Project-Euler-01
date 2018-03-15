import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long s=0L;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            long a=(n-1)/3;
            long b=3*a*(a+1)/2;
            long c=(n-1)/5;
            long d=5*c*(c+1)/2;
            long e=(n-1)/15;
            long f=15*e*(e+1)/2;
            /*
            for(int i=1;i<n;i++){
                if(i%5==0||i%3==0){
                    s=s+i;
                }
            }*/
            s=b+d-f;
            System.out.println(s);
            s=0;
        }
    }
}
