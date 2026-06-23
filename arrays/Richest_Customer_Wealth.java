package arrays;

class Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int rows=accounts.length;
        int max=0;
        int cols=accounts[0].length;
        for(int i=0;i<rows;i++){
            int sum=0;
            for(int j=0;j<cols;j++){
sum+=accounts[i][j];
            }
            if(max<sum)
            max=sum;
        }
        return max;
    }
}