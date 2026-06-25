package strings;

import java.util.HashMap;

public class longestSubstringWithoutRepeatingCharacters {
     public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0,max=0;
        int n=s.length();
        while(j<n){
            char ch=s.charAt(j);
            if(map.containsKey(ch) && i<=map.get(ch)){
                i=map.get(s.charAt(j))+1;
            }
            map.put(ch,j);
            max=Math.max(j-i+1,max);
            j++;
        }
        return max;
    }
}
