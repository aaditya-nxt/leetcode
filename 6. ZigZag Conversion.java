class Solution {
    public String convert(String s, int numRows) {
        StringBuffer[] buffer = new StringBuffer[numRows];
        for(int i = 0; i < numRows; i++) {
            buffer[i] = new StringBuffer("");
        }
        for(int i = 0; i < s.length();) {
            int downCounter = numRows - 2;
            for(int j = 0; i < s.length() && j < numRows;j++) {
                buffer[j].append(s.charAt(i));
                i++;
            }
            for(int j = downCounter; i < s.length() && j > 0; j--) {
                buffer[j].append(s.charAt(i));
                i++;
            }
        }
        String ans = "";
        for(int i = 0; i < numRows; i++) {
            ans += buffer[i].toString();
        }
        return ans;
    }
}
