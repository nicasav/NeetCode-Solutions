import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int value : nums) 
        {
            set.add(value);
        }
        if (nums.length != set.size()) 
        {
            return true;
        }
        return false;
    }
}
