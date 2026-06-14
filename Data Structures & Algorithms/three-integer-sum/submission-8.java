class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> answer = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
         Set<Integer> dummy = new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                if(dummy.contains(-(nums[i]+nums[j])))
                {
                    answer.add(Arrays.asList(nums[i],nums[j],(-(nums[i]+nums[j]))));
                }
            dummy.add(nums[j]);
            }
        }
    return new ArrayList<>(answer);
    }
}
