package give.me.five.solution.s6;

public class PrintHelloWorldTest_V2 {

    public void printHelloWorld() {
        Thread t = new Thread(() -> {
            while(true) {
                try {
                    System.out.println("hello, world");
                    Thread.sleep(1000);
                }catch (Exception ignored) {

                }
            }
        });
        t.start();
    }
}
