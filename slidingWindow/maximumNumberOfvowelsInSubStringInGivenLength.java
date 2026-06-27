package slidingWindow;

public class maximumNumberOfvowelsInSubStringInGivenLength {
     public int maxVowels(String s, int k) {
        int left=0;
        int n=s.length();
        int v=0;
        int maxVowel=0;
        for(int right=0;right<n;right++){
            if(right>=k){
                if("aeiou".indexOf(s.charAt(left))!=-1){
                v--;
                }
                left++;
            }
            if("aeiou".indexOf(s.charAt(right))!=-1){
                v++;
            }
            maxVowel=Math.max(maxVowel,v);
        }
        return maxVowel;
    }
}
