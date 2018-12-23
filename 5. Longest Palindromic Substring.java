class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.isEmpty())
            return s;
        int[] lenOdd = new int[s.length()];
        int[] lenEven = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int low = i-1, high = i+1;
            int len = 1;
            while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
                len+=2;
            }
            lenOdd[i] = len;
                  
             low = i; high = i+1;
             len = 0;
            while(low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
                len+=2;
            }
            lenEven[i] = len;
        }
    
    int max = 0;
    String ans = "";
    
    for(int i = 0; i < s.length(); i++) {
    if(lenOdd[i] > max) {
            max = lenOdd[i];
            ans = s.substring(i - lenOdd[i]/2, i + lenOdd[i]/2+1);
        }
        if(lenEven[i] > max) {
            max = lenEven[i];
            ans = s.substring(i - lenEven[i]/2 + 1, i + lenEven[i]/2 + 1);
        }
    }
                  return ans;
}
}
