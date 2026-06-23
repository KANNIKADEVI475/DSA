package strings;

import java.util.Arrays;

public class shortestDistanceToAcharacter {
     public int[] shortestToChar(String s, char c) {
        int i=0,j=0;
        int[] nums=new int[s.length()];
        Arrays.fill(nums,Integer.MAX_VALUE);
        while(i< s.length() && j< s.length()){
if(s.charAt(j)==c){
while(i<=j){
nums[i]=Math.min(nums[i],j-i);
i++;
}
while(i<s.length() && i>j){
nums[i]=Math.min(nums[i],i-j);
i++;
}
i=j;
}
j++;
  }
return nums;
    }
}
