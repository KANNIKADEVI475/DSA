package arrays;

import java.util.HashSet;

public class containsDuplicate {
     public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        
        for(int num:nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
