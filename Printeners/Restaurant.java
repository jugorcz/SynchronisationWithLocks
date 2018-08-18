/**
 * Created by Justyna Gorczyca on 08.11.2017.
 */
public class Restaurant {
    public final static int N = 7;

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        for(int i = 0; i < N; i++) {
            new Thread(new Client(i, waiter)).start();
            new Thread(new Client(i, waiter)).start();
        }

    }

}