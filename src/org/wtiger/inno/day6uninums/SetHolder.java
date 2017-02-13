package org.wtiger.inno.day6uninums;

import java.util.HashSet;

/**
 * Created by olymp on 13.02.2017.
 */
public class SetHolder {
    private volatile boolean stop = false;
    private int max = 100;
    private HashSet<Integer> set = new HashSet<>(max);

    SetHolder(){

    }

    SetHolder(int max){
        this.setMax(max);
    }

    public synchronized void addNum(int bt) {
        set.add(bt);
    }

    public synchronized int getSize() {
        return set.size();
    }

    public void stopIt(){
        stop = true;
    }

    public boolean stopped(){
        return stop;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
