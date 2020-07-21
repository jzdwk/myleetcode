package com.lc.question;

/**
 * Created by cmcc on 2020-01-15.
 */
public class Clazz97 {
    /*
    * Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"  Output: true
    * */
    public boolean isInterleave(String s1, String s2, String s3) {
        return doInterleave(s1,s2,s3);
    }

    private boolean doInterleave(String s1, String s2, String s3) {
        if (s1.equals(s2)&&s1.equals("")){
            return s3.equals("");
        }
        if(s2.equals("")&&!s1.equals("")){
            return s1.equals(s3);
        }
        if (s1.equals("")&&!s2.equals("")){
            return s2.equals(s3);
        }
        //s1 != "" && s2 != ""
        char ch3 = s3.charAt(0);
        char ch1 = s1.charAt(0);
        char ch2 = s2.charAt(0);
        if (ch1 == ch3 && ch2 == ch3){
            //chose s1
            boolean b1 = doInterleave(s1.substring(1),s2,s3.substring(1));
            if (!b1){
                return doInterleave(s1,s2.substring(1),s3.substring(1));
            }
            return b1;
        }
        if (ch1 == ch3 && ch2 != ch3){
            return doInterleave(s1.substring(1),s2,s3.substring(1));
        }
        if(ch1 != ch3 && ch2 == ch3){
            return doInterleave(s1,s2.substring(1),s3.substring(1));
        }
        return false;
    }
}
