class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int i=0;
        int j=0;
        HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(!map.containsKey(ch)){
            map.put(ch,i++);
            }
        }

        for(char ch:t.toCharArray()){
            if(!map2.containsKey(ch)){

            
            map2.put(ch,j++);
            }
        }


        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        for(char ch:s.toCharArray()){
            list1.add(map.get(ch));
        }
        for(char ch:t.toCharArray()){
            list2.add(map2.get(ch));
        }
        return list1.equals(list2);
    }
}