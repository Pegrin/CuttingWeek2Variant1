package org.wtiger.inno.day6uninums;

/**
 * Created by olymp on 13.02.2017.
 */
public class NumoGenerator implements Runnable {
    private SetHolder set;

    NumoGenerator(SetHolder set){
        this.set = set;
    }

    @Override
    public void run() {
        while (!set.stopped()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Integer bt = (int) (Math.random() * set.getMax());
            System.out.println("added: "+bt);
            set.addNum(bt);
        }
    }
}
