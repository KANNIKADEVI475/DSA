package slidingWindow;

import java.util.HashSet;

public class maximumSumDistictSubArray {
     public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();

        int left=0;
        long max=0;
        long sum=0;

        for(int right=0;right<nums.length;right++){

            while(set.contains(nums[right])){
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]);           
            sum+=nums[right];
            if(right-left+1 == k){
                max=Math.max(sum,max);

                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }
        }
        return max;
    }
}
