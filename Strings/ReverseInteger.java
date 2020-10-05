class Solution {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        if (x < 0)
            sb.append(-x);
        else
            sb.append(x);
        sb.reverse();
        if(x < 0)
            sb.insert(0, '-');
        String s = sb.toString();
        try 
        {
            Integer ans = Integer.valueOf(s);
            return ans.intValue();
        }
        catch(Exception e)
        {
            return 0;
        }        
    }
}
