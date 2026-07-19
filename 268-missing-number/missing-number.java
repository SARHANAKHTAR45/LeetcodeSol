class Solution {
    public int missingNumber(int[] nums) {
        int missing_number=0;
        int l=nums.length;
        int expectedsum=l*(l+1)/2;
        int actualsum=0;
        for(int i=0; i<l; i++){
            actualsum+=nums[i];
        }
        missing_number=expectedsum-actualsum;
        return missing_number;

    }
}