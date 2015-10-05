{
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        int n = nums.length;
        
        if(n == 1)
            return nums[0];
            
        for(int i = 0; i < n; i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
            else
                hm.put(nums[i], 1);
        }
        
        int max = Integer.MIN_VALUE;
        int i = -1;
        for(int k : hm.keySet())
        {
            if(hm.get(k) >= max)
            {
                max = hm.get(k);
                i = k;
            }
        }
        
        return i;
    }
}
