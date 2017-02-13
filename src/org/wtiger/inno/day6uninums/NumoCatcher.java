package org.wtiger.inno.day6uninums;

/**
 * Created by olymp on 13.02.2017.
 */
public class NumoCatcher implements Runnable {
    private SetHolder set;

    NumoCatcher(SetHolder set){
        this.set = set;
    }

    @Override
    public void run() {
        int size;
        while (!set.stopped()) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            size = set.getSize();
            System.out.println("Уникальных значений сгенерированно: " + size);
            if (size == set.getMax()) {
                set.stopIt();
            }
        }
    }
}
