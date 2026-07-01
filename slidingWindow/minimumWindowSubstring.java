public class  minimumWindowSubstring{
    public String minWindow(String s, String t) {
        int[] fret=new int[128];
        int[] win=new int[128];

        int n=s.length();
        int m=t.length();

        int required=0;
        for(int i=0;i<m;i++){
            char ch=t.charAt(i);
            if(fret[ch]==0){
                required++;
            }
            fret[ch]++;
        }

        int left=0,start=0;
        int min=Integer.MAX_VALUE;
        int formed=0;

        for(int right=0;right<n;right++){
            char ch1=s.charAt(right);
            win[ch1]++;

            if(fret[ch1]>0 &&fret[ch1]==win[ch1]){
                formed++;
            }

            while(left<=right && formed==required){
                char ch2=s.charAt(left);

                int curr=right-left+1;
                if(curr<min){
                    min=curr;
                    start=left;
                }

                win[ch2]--;
                if(fret[ch2]>0 && win[ch2]<fret[ch2]){
                    formed--;
                }

                left++;
            }
        }

return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
    }
}