package com.lc.question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmcc on 2019-11-25.
 */
public class Clazz68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int tempWidth = maxWidth;
        int wordNum = 0;
        List<String> rst = new ArrayList<String>();
        String tempStr = "";
        for (String word: words) {
           if (tempWidth>=word.length()){
               tempStr+=(word+",");
               tempWidth -= word.length();
           }else{
               //add row
               rst.add(tempStr);
               //reset
               tempWidth = maxWidth;
               tempStr = word;
               tempWidth -= tempStr.length();
           }
        }

        return rst;
    }

    private String doFill(String tempStr, int maxWidth){
       //todo
        return "";
    }
}
