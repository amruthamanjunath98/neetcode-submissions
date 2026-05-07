class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> n = new HashMap<>();


        for(int i=0;i<nums.length;i++)
        {
            int val=target-nums[i];
            if(n.containsKey(val))
            {
                return new int[] {n.get(val),i};
            }

           
            n.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
