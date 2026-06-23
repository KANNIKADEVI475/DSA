package arrays;

public class removeElement {
    public int removeElement(int[] nums, int val) {
        // int n=nums.length;
        // int i=0,j=n-1;
        // while(i<j){
        //     if(nums[j]==val){
        //         j--;
        //     }
        //     if(nums[i]!=val){
        //         i++;
        //     }
        //     else{
        //         int temp=nums[i];
        //         nums[i]=nums[j];
        //         nums[j]=temp;
        //     }
        // }
        // return j+1;
        int k=0;
        for(int num:nums){
            if(num!=val){
                nums[k++]=num;
            }
        }
        return k;
    }
}
