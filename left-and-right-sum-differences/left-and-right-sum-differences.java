class Solution {
    public int[] leftRightDifference(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int l=0;
            int r=0;
            for(int j=0;j<i;j++){
                l=l+nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                r=r+nums[j];
            }
            int ab=Math.abs(l-r);
            a[i]=ab;
        }
        return a;
        
    }
}