class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        System.out.println(set.size());
        System.out.println(nums.length);
        if(set.size()!=nums.length)
        {
            return true;
        }
        return false;        
    }
}