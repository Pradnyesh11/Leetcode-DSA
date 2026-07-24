class Solution 
{
    int count;
    int max=0;
    public int arrayNesting(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            count=0;
            func(nums,i);
        }
        return max;
    }
    public void func(int[] nums,int i)
    {
        if(nums[i]==Integer.MIN_VALUE)
        {
            max=Math.max(max,count);
            return;
        }
        count++;
        int t=nums[i];
        nums[i]=Integer.MIN_VALUE;
        func(nums,t);
    }
}