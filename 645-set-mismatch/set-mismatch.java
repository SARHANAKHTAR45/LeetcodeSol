class Solution {
    public int[] findErrorNums(int[] nums) {
        int l = nums.length;
        Set<Integer> set=new HashSet<>();
        int duplicate=0;
        for (int num:nums) {
            if (set.contains(num)) {
                duplicate = num;
            } else {
                set.add(num);
            }
        }
        int expectedsum=l*(l+1)/2;
        int actualsum=0;

        for (int i=0; i<l; i++) {
            actualsum+=nums[i];
        }
        int missingnumber=expectedsum-actualsum+duplicate;
        return new int[]{duplicate, missingnumber};
    }
}
    
