package arrays;

public class thirdMaximumNumber {
     public int thirdMax(int[] nums) {
        long fLar=Long.MIN_VALUE;
        long sLar=Long.MIN_VALUE;
        long tLar=Long.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(fLar < nums[i]){
                tLar=sLar;
                sLar=fLar;
                fLar=nums[i];
            }
            else if(sLar <nums[i] && nums[i]!=fLar){
                tLar=sLar;
                sLar=nums[i];
            }
            else if(tLar<nums[i] && nums[i]!=sLar && nums[i]!=fLar){
                tLar=nums[i];
            }
        }
            return tLar==Long.MIN_VALUE?(int)fLar:(int)tLar;
    }
}
