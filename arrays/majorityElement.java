package arrays;

public class majorityElement {
      public int majorityElement(int[] nums) {
    //     Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    //   for(int num:nums){
    //     map.put(num,map.getOrDefault(num,0)+1);
    //   }
    //   for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    //     if(entry.getValue()>nums.length/2)
    //     return entry.getKey();
    //   }
    //   return -1;
    int count=0;
    int candidate=0;
    for(int num:nums){
        if(count==0)
        candidate=num;
        if(num==candidate)
        count++;
        else
        count--;
    }
    return candidate;
    }
}
