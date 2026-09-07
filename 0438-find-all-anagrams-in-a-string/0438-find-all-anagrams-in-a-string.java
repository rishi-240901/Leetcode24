class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.length()<p.length()){
            return ans;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : p.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int k=p.length();
        HashMap<Character,Integer> window = new HashMap<>();
        for(int i = 0 ; i < k ; i++) {
            char ch = s.charAt(i);
            window.put(ch,window.getOrDefault(ch,0)+1);
        }
        if(map.equals(window)) {
            ans.add(0);
        }
        for(int i=k ; i < s.length() ; i++) {
            char add = s.charAt(i);
            window.put(add,window.getOrDefault(add,0)+1);

            char remove = s.charAt(i-k);
            window.put(remove,window.get(remove)-1);

            if(window.get(remove) == 0) {
                window.remove(remove);
            }
            if (map.equals(window)) {
                ans.add(i - k + 1);
            }
        }
        return ans;
    }
}