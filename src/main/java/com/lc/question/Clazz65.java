package com.lc.question;

/**
 * Created by cmcc on 2019-11-25.
 */
public class Clazz65 {
    public int[] plusOne(int[] digits) {
        if (digits == null ) return digits;
        int carry = 0;
        int current = 0;
        int index = digits.length-1;
        int last = digits[index];
        if (last==9){
            digits[index]=current;
            carry = 1;
            int i=index-1;
            for (;i>=1;i--){
                current = (digits[i]+carry)%10;
                carry = (digits[i]+carry)/10;
                digits[i] = current;
            }
            //one num
            if (i == -1){
                return new int[]{1,0};
            }
            //two or more i==0
            if (digits[i]==9&&carry==1){
                current = (digits[i]+carry)%10;
                digits[i] = current;
                int[] total=new int[digits.length+1];
                total[0]=1;
                for (int j = 1;j<total.length;j++){
                    total[j] = digits[j-1];
                }
                return total;
            }else{
                digits[i]=carry+digits[i];
            }
        }else{
            digits[index]=last+1;
        }
        return digits;
    }
}
