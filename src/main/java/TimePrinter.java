import java.util.*;


/**
 * ¼ÆÊ±Æ÷Àà
 */
class TimePrinter extends Thread {

    int pauseTime;
    String name;

    public TimePrinter(int pauseTime, String name) {
        this.pauseTime = pauseTime;
        this.name = name;
    }

    public void run() {
        while(true) {
            try {
                System.out.println(name + ":" + new
                        Date(System.currentTimeMillis()));
                Thread.sleep(pauseTime);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }


}