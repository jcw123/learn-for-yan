package give.me.five.solution.s6;

import java.util.Timer;
import java.util.TimerTask;

// remark: good
public class PrintHelloWorldTest extends TimerTask{
        public void run() {
            System.out.println("Hello World");
        }

        public static void main(String[] args) {
            Timer timer = new Timer();
            timer.schedule(new PrintHelloWorldTest(), 0, 1000);

            /*while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException Exception" + e.getMessage());
                }
            }*/
        }

    }


