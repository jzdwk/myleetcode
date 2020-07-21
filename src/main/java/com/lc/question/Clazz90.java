package com.lc.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cmcc on 2019-12-26.
 */
public class Clazz90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums); //排序
        getAns(nums, 0, new ArrayList<Integer>(), ans);
        return ans;
    }

    private void getAns(int[] nums, int start, ArrayList<Integer> temp, List<List<Integer>> ans) {
        ans.add(new ArrayList<Integer>(temp));
        for (int i = start; i < nums.length; i++) {
            //和上个数字相等就跳过
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            getAns(nums, i + 1, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }
    public static void main(String[] args) {
        List rst = new Clazz90().subsetsWithDup(new int[]{1,2,3,4});
    }
}


