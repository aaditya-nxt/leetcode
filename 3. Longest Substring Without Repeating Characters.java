class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
            return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLen = 1;
        int currLen = 1;
        map.put(s.charAt(0), 0);
        for(int i = 1; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(i - map.getOrDefault(c, -1) > currLen) {
                currLen++;
            } else {
                currLen = i - map.get(c);
            }
            map.put(c, i);
            if(currLen > maxLen)
                maxLen = currLen;
        }
        return maxLen;
    }
}
