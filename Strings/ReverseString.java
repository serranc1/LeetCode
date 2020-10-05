class Solution {
    public void reverseString(char[] s) {
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            char temp = s[i];
            s[i] = s[j - 1];
            s[j - 1] = temp;
            j--;
        }
    }
}
