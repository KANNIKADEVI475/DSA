package slidingWindow;

public class numberOfSubarraysOfGivenLengthAndHavingAverageGreaterThanThreshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int left=0;
       int n=arr.length;
       int currentSum=0;
       int c=0;
       for(int right=0;right<n;right++){
        if(right>=k){
        double avg=currentSum/k;
        if(avg>=threshold){
            c++;
        }
        currentSum-=arr[left];
        left++;
        }
        currentSum+=arr[right];
       }
       if(currentSum/k >=threshold)
       c++;
       return c; 
    }
}
