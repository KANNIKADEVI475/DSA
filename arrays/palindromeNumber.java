package arrays;

public class palindromeNumber {
   public boolean isPalindrome(int x) {
    int r;
    long sum=0;
    int temp=x;
    if(x<0){
        return false;
    }
    else{
    while(x!=0){
    r=x%10;
    sum=sum*10+r;
    x=x/10;
    }
    if(temp==sum){
    return true;
    }
    else{
        return false;
    }
    }
}

}
