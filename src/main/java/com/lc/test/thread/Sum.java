package com.lc.test.thread;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/**
 * Created by cmcc on 2020-07-21.
 */
public class Sum{
    //hotspot将java thread映射为内核线程，因此测试多任务的sum操作

    public static void main(String[] args) throws InterruptedException {
        new Sum().doSum();
    }

    private void doSum() throws InterruptedException {
        ArrayList<task> tasks = new ArrayList<>();
        int total = 10000;
        int size = total/10+1;
        CountDownLatch count = new CountDownLatch(size);
        int[] rst = new int[size];
        for(int i = 0; i < total/10; i++) {
            task t = new task(i * 10,(i+1)*10 - 1,rst,count,i);
            tasks.add(t);
        }
        tasks.add(new task(total,total,rst,count,total/10));
        long startTime=System.currentTimeMillis();
        for (int i = 0;i<size;i++){
           new Thread(tasks.get(i)).start();
        }
        count.await();
        long endTime=System.currentTimeMillis();
        int sum = 0;
        for(int i=0; i<size; i++){
            sum += rst[i];
        }
        System.out.println(sum);
        System.out.println(endTime-startTime);
    }

    private class task implements Runnable{
        private int start;
        private int end;
        private int[] result;
        private CountDownLatch cdl;
        private int num;

        public task(int start, int end, int[] result, CountDownLatch cdl, int num) {
            this.start = start;
            this.end = end;
            this.result = result;
            this.cdl = cdl;
            this.num = num;
        }

        @Override
        public void run() {
            int sum = 0;
            for(long i=start; i<=end; i++){
                sum += i;
            }
            result[num] = sum;
            cdl.countDown();
        }
    }
}
