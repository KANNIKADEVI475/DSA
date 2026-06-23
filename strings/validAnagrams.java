package strings;

import java.util.Arrays;

public class validAnagrams {
     public boolean isAnagram(String s, String t) {
        // StringBuilder sb=new StringBuilder(t);
        // int n = s.length();
        // int m=t.length();
        // if(n!=m)
        // return false;
        // for (int i = 0; i < n; i++) {
        //     char ch = s.charAt(i);
        //     int r = sb.indexOf(ch+"");
        //     if(r==-1)
        //     return false;
        //     sb.deleteCharAt(r);
        // }
        // return true;
        char [] a1=s.toCharArray();
        char [] a2=t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1,a2))
        return true;
        else 
        return false;

    }
}
