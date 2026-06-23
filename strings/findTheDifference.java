package strings;

public class findTheDifference {
     public char findTheDifference(String s, String t) {
      /* HashMap<Character,Integer> map1=new HashMap<>();
       HashMap<Character,Integer> map2=new HashMap<>();

       for(int i=0;i<s.length();i++){
        map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
       }
       for(int i=0;i<t.length();i++){
        map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
       }
       
       char ch=' ';
       for(int i=0;i<t.length();i++){
        if(map1.containsKey(t.charAt(i))){
if(map1.get(t.charAt(i))!=map2.get(t.charAt(i))){
ch=t.charAt(i);
break;
}
        }
        else{
            ch =t.charAt(i);
            break;
        }
       }
       return ch;*/

       int sum=0;
       for(char ch:t.toCharArray()){
        sum+=ch;
       }
       for(char ch:s.toCharArray()){
        sum-=ch;
       }
       return (char)sum;
    }
}
