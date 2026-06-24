package slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class findAllAnagrams {
     public List<Integer> findAnagrams(String s, String p) {
        int[] frep=new int[26];
        int[] fres=new int[26];

        List<Integer> list=new ArrayList<>(); 


        int k=p.length();
        for(int i=0;i<k;i++){
            char ch=p.charAt(i);
            frep[ch-'a']++;
        }

        int i=0;
        while(i<s.length()){
        if(i>=k){
            fres[s.charAt(i-k)-'a']--;
        }
        char ch=s.charAt(i);
        fres[ch-'a']++;

        boolean found=isEqual(fres,frep);
        if(found)
        list.add(i-k+1);
        i++;
        }
        return list;
    }
    static boolean isEqual(int[] fres, int[] frep){
        for(int i=0;i<26;i++){
            if(frep[i]!=fres[i])
            return false;
        }
        return true;
    }
}
