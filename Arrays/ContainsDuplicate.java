class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hash_table = new HashMap<>();
        for (int i : nums) 
        {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
            if(hash_table.getOrDefault(i, 1) > 1)
                return true;
        }
        return false;
    }
}
