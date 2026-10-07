class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            int leftsq=nums[left]*nums[left];
            int rightsq=nums[right]*nums[right];
            if(leftsq>rightsq){
                ans[i]=leftsq;
                    left++;
            }
            else{
                ans[i]=rightsq;
                    right--;
            }
        }
        return ans;
    }
}