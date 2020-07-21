package com.lc.question;

/**
 * Created by cmcc on 2019-12-09.
 */
public class Clazz80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        int j = 1;
        int pre = nums[i]; // 这里需要排空
        boolean state = true; // >=

        while(j < nums.length){
            if(state == true ? nums[j] >= nums[i] : nums[j] > nums[i]){
                i++;
                //交换值
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            j++;
            //通过比较pre和nums[i]，来确定下一次的state
            if(pre == nums[i]){
                state = false;
            }else if(pre < nums[i]){
                pre = nums[i];
                state = true;
            }
        }
        return i+1;
    }
}
