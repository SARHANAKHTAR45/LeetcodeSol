import java.math.BigInteger;
class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int count=0;
        for (int i=0; i<nums.length; i++) {
            int gcd=0;
            for(int j=i; j<nums.length; j++) {
                gcd=BigInteger.valueOf(gcd)
                        .gcd(BigInteger.valueOf(nums[j]))
                        .intValue();
                if(gcd==k){
                    count++;
                }else if(gcd<k) {
                    break;
                }
            }
        }
        return count;
    }
}
