package siilen.problems;

public class MaximumSubarray {
    public MaximumSubarray() {}
    public int maxSubArray(final int[] nums) {
        int max = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max + nums[i], nums[i]);
            res = Math.max(res, max);
        }
        return res;
    }
}
