package arrays;

public class missingNumber {
  
    public int missingNumber(int[] nums) {
//             Map<Integer,Integer> map=new HashMap<Integer,Integer>();
//         for(int num:nums){
//              map.put(num,1);
//         }
//         for(int i=0;i<=nums.length;i++){
// if(!map.containsKey(i))
// return i;
//         }
//         return -1;
int n=nums.length;
int total=(n*(n+1))/2;
int actual=0;
for(int num:nums){
    actual+=num;
}
return (total-actual);
    }
}

