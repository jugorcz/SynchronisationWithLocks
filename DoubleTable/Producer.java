/**
 * Created by Justyna Gorczyca on 09.11.2017.
 */
public class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for(int i = 0;  i < Main.ILOSC;   i++) {
            try {
                buffer.put("msg " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}