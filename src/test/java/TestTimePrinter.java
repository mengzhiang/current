import com.zhiang.current.TimePrinter;

/**
 * Created by mengzhiang on 16/1/17.
 */
public class TestTimePrinter {

     public static void main(String args[]) {

        TimePrinter tp1 = new TimePrinter(1000, "Fast Guy");
        tp1.start();

        TimePrinter tp2 = new TimePrinter(3000, "Slow Guy");
        tp2.start();

    }
}
