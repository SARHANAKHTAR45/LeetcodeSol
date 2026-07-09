class Solution {
    public int maxProduct(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<nums.length-i-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        int a= nums.length-1;
        int b= nums.length-2;
        return (nums[a]-1)*(nums[b]-1);
    }
}