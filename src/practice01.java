/*
题目：
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。
 */
public class practice01 {
    public static void main(String[] args) {
        int m[] = {2,7,1,4};
        int x[] = twoSum(m,6);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
            int m[] = new int[2];
            for (int i = 0; i < nums.length ; i++) {
                for (int j = i+1; j < nums.length ; j++) {
                    if(nums[i]+nums[j] == target){
                        m[0] = i;
                        m[1] = j;
                    }
                }
            }
            return m;
//return new int[]{i, j};
    }
}

/*


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}

 */