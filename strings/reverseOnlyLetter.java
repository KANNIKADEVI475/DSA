//package strings;

public class reverseOnlyLetter {
     public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if( !Character.isAlphabetic(arr[j])){
                j--;
            }
            else if(!Character.isAlphabetic(arr[i])){
                i++;
            }
            else if(Character.isAlphabetic(arr[i]) && Character.isAlphabetic(arr[j])){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}
