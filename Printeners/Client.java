/**
 * Created by Justyna Gorczyca on 08.11.2017.
 */
public class Client implements Runnable {
    private int pairID;
    private Waiter waiter;

    public Client(int pairID, Waiter waiter) {
        this.pairID = pairID;
        this.waiter = waiter;
    }

    public void run() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        waiter.getTable(pairID);
        waiter.releaseTable();
    }
}