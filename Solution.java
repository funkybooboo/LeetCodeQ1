// insoration https://www.youtube.com/watch?v=Yyyi12oaK94

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        System.out.println("Example one");
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println("Example two");
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println("Example three");
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> complements = new HashMap<>();
        // K = complementIndex
        // V = index
        Integer complementIndex;
        for (int i = 0; i < nums.length; i++) {
            complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }

    private static int[] slow(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
}
