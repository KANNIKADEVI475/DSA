package arrays;

public class RunningSumOf1dArray {
  
    public int[] runningSum(int[] nums) {
//         int n=nums.length;
//         int e=0;
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=0;j<=i;j++){
// sum+=nums[j];
//             }
//             arr[e++]=sum;
//         }
//         return arr;
//     }
int n=nums.length;
        int e=0,sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            sum+=nums[i]; 
            arr[e++]=sum;
        }
        return arr;
    }
}

