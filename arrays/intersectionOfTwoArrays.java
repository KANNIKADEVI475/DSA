package arrays;

import java.util.HashSet;

public class intersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();

        for(int num:nums1){
            h1.add(num);
        }
        for(int num:nums2){
            h2.add(num);
        }
        h1.retainAll(h2);

        int[] arr=new int[h1.size()];
        int i=0;
        for(int num:h1){
            arr[i++]=num;
        }
        return arr;
    }
}
