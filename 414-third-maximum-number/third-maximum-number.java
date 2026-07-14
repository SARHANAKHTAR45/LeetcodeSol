class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        if(set.size()<3){
            int max=Integer.MIN_VALUE;
            for(int num:set){
                max=Math.max(max, num);
            }
            return max;
        }
        set.remove(Collections.max(set));
        set.remove(Collections.max(set));

        return Collections.max(set);
    }
}