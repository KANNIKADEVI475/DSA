public class guessTheNumberHigherOrLower{
static int[][] dp;

    public int getMoneyAmount(int n) {
     dp=new int[n+1][n+1];

    return cal(1,n)   ;
    }

    static int cal(int start, int end){
        if(start>=end){
            return 0;
        }

        if(dp[start][end]!=0){
            return dp[start][end];
        }

        int min=Integer.MAX_VALUE;
        for(int i=(start+end)/2;i<=end;i++){
        
        int left=cal(start,i-1);

        int right=cal(i+1,end);

        int result=i+(Math.max(left,right));

        min=Math.min(min,result);

        }
        dp[start][end]=min;
        return min;
    }
}