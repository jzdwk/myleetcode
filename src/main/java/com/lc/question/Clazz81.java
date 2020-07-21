package com.lc.question;

/**
 * Created by cmcc on 2019-12-13.
 */
public class Clazz81 {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return false;
        }
        if (nums.length == 1){
            return nums[0]==target;
        }
        int left = 0, right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]==target) return true;
            //重要
            if (nums[left] == nums[mid]) {
                left++;
                continue;
            }
            //左边比中间小，说明前半部分是有序的
            if (nums[left]<nums[mid]){
                //有序下，target比mid小,并且target大于最左，则在前半部分
                if (target<nums[mid]&&nums[left]<=target){
                    right = mid -1;
                }else{ //否则 在后， 如 4,5,6,1,2,3,  找2
                    left = mid +1;
                }
            }else{// 左边比中间大，说明前半部分倒置，后半部分有序，如3,4,1,2,3
                //如果target 大于mid 并且target小于最后的，则在后半部分找，否则前半部分
                if (target>nums[mid]&&target<=nums[right]){
                    left = mid+1;
                }else{
                    right = mid -1;
                }
            }
        }
        return false;
    }
}
