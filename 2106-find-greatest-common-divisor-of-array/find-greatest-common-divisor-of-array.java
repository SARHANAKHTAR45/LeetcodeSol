class Solution {
    public int findGCD(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<nums.length-i-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        int smallest=nums[0];
        int largest=nums[nums.length-1];
        int gcd=0;

        for(int i=1; i<=largest; i++){
            if(smallest%i==0 && largest%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}