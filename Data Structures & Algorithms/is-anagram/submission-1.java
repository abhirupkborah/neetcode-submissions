class Solution {
    // public boolean isAnagram(String s, String t) {
    //    return sort(s).equals(sort(t));
    // }

    // public String sort(String str){
    //     char[] chars = str.toCharArray();
    //     Arrays.sort(chars);
    //     return new String(chars);
    // }-- APPROACH - 1 

    public boolean isAnagram(String s, String t){
        if(s.length() != t.length())return false;

        Map<Character, Integer> ans = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ans.containsKey(ch)){
                ans.put(ch, ans.get(ch)+1);
            }
            else{
                ans.put(ch, 1);
            }
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);

            if(!ans.containsKey(ch))return false;

            ans.put(ch, ans.get(ch)-1);

            if(ans.get(ch)<0)return false;
        }

        return true;
    }
}
