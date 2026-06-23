package strings;

public class reverseWordsInAString {
       public String reverseWords(String s) {
        String str=s.trim();
        String words[]=str.split("\\s+");
        int n=words.length;
        StringBuilder sb=new StringBuilder();
        // for(int i=n-1;i>=0;i--){
        //     sb.append(words[i]);
        //     if(i!=0)
        //     sb.append(" ");
        // }
        int i=0,j=n-1;
        while(j>=n/2){
String temp=words[i];
words[i]=words[j];
words[j]=temp;
i++;
j--;
        }
        String result=String.join(" ",words);
       // return words.toString();
       return result;
    }
}
