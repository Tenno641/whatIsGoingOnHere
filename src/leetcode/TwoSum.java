package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                System.gc();
                return new int[] {i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }

        System.gc();
        return null;

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15}, 9)));

    }

}
