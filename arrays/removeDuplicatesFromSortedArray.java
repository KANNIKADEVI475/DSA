package arrays;

public class removeDuplicatesFromSortedArray {
       public int removeDuplicates(int[] nums) {
        // int n=nums.length;
        // int result[]=new int[n];
        // int e=0;
        // for(int i=0;i<n-1;i++){
        //     if(nums[i]!=nums[i+1]){
        //    result[e++]=nums[i];
        //     }
        // }
        // result[e++]=nums[n-1];
        // for(int i=0;i<e;i++){
        //     nums[i]=result[i];
        // }
        // return e;
        int k=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[k]){
                k=k+1;
                nums[k]=nums[i];
            }
        }
        return k+1;
    }
}
