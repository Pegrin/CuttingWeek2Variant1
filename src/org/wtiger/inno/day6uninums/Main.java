package org.wtiger.inno.day6uninums;

public class Main {

    public static void main(String[] args) {
        SetHolder set = new SetHolder(10);
        Thread nc = new Thread(new NumoCatcher(set));
        nc.setName("Catcher");
        nc.start();
        Thread ng = new Thread(new NumoGenerator(set));
        ng.setName("Generator");
        ng.start();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        set.stopIt();
    }
}
