/**
 * Created by Justyna Gorczyca on 09.11.2017.
 */
public class Main {
    public static final int ILOSC = 100;
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
        try {
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}