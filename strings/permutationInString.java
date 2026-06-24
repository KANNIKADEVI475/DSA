class permutationInString {
    public boolean checkInclusion(String s1, String s2) {
        
        int k=s1.length();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        int i=0;
        while(i<k){
        map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        i++;
        }
    

        i=0;
        while(i<s2.length()){
        if(i>=k){
        if(map2.get(s2.charAt(i-k))>1){
        map2.put(s2.charAt(i-k),map2.get(s2.charAt(i-k))-1);
        }
        else
        map2.remove(s2.charAt(i-k));
        }
        map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0)+1);

        if(map1.equals(map2))
        return true;
        i++;
        }

return false;
    }
}