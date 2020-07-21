package com.lc.question;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmcc on 2019-12-31.
 */
public class Clazz93 {
    public List<String> restoreIpAddresses(String s) {
        if (s.length()<4||s.length()>12) return new ArrayList<String>();
        List<List<String>> rst = new ArrayList<List<String>>();
        List<String> temp = new ArrayList<String>();
        doIpAddress(rst,temp,s,0,1);
        List<String> finalRst = new ArrayList<String>();
        for (List<String> temp1:rst) {
            String s1 = "";
            for (String s2:temp1) {
                s1+=(s2+".");
            }
            finalRst.add(s1.substring(0,s1.length()-1));
        }
        return finalRst;
    }

    private void doIpAddress(List<List<String>> rst, List<String> tempRst, String s, int start, int part){
        if (part==5){
            List<String> temp = new ArrayList<String>(tempRst);
            rst.add(temp);
            return;
        }
        for (int i = 1; i <4 ; i++) {
            //如果剩余的值，不够构成ip的最小位数，或者最大位数，则直接返回
            int cur = s.length()-(start+i);
            int min = 4-part;
            int max = (4-part)*3;
            if (cur<min||cur>max) continue;
            String temp = s.substring(start,start+i);
            //有以下3中情况，则舍去 1.temp值大于255 2.temp非0，但是开头值是0 3.temp是0，但是temp大于1位
            if (Integer.parseInt(temp)>255||(Integer.parseInt(temp)>0&&temp.charAt(0)=='0')||Integer.parseInt(temp)==0&&temp.length()>1) break;
            tempRst.add(temp);
            doIpAddress(rst,tempRst,s,start+i,++part);
            //回溯至前一状态
            tempRst.remove(tempRst.size()-1);
            part--;
        }
    }
}
