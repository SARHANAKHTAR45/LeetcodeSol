class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_counter=0;
        int current_counter=0;
        Stack<Integer> stck= new Stack<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                stck.push(nums[i]);
                current_counter++;
                if(current_counter>max_counter){
                    max_counter=current_counter;
                }
            }else{
                stck.clear();
                current_counter=0;
            }
        }
        return max_counter;
    }
}