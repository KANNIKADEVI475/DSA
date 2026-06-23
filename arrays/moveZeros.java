package arrays;

public class moveZeros {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
           if(j<nums.length && nums[j]!=0)
           j++;
         if(nums[i]!=0 && j<=i){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
    }
}
