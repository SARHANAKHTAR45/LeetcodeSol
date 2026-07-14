class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int max=nums.length;
        HashSet<Integer> hs= new HashSet<>();
        for(int i=1; i<=max; i++){
            hs.add(i);
        }

        for(int i: nums){
            if(hs.contains(i)){
                hs.remove(i);
            }
        }
        int sz= hs.size();   
        List<Integer> ans= new ArrayList();
        for(int num:hs){
            ans.add(num);
        }
        return ans;
        
    }
}