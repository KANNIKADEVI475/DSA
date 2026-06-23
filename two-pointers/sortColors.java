package two-pointers;

public class sortColors {
    public void sortColors(int[] nums) {
          // ArrayList<Integer> list=new ArrayList<>();
        // for(int num:nums){
        //     list.add(num);
        // }
        // for(int i=0;i<nums.length;i++){
        //     nums[i]=Collections.min(list);
        //     list.remove(Integer.valueOf(nums[i]));
        // }
        int zero=0,one=0,two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
            zero++;
            }
            else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(zero>0){
                nums[i]=0;
                zero--;
            }
            else if(one>0){
                nums[i]=1;
                one--;
            }
            else{
                nums[i]=2;
            }
        }
    }
}
