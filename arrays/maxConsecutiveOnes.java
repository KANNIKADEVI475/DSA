package arrays;

public class maxConsecutiveOnes {
     public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,max=0;
        for(int num:nums){
            if(num == 1)
                c++;
            else{
                if(max<c)
                    max=c;
                c=0;
            }
        }
         if(max<c)
                    max=c;
        return max;
    }
}
