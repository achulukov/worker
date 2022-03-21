import worker.*;
public class Main {

    static OnTaskErrorListener errorCallback = System.out::println;
    static OnTaskDoneListener listener = System.out::println;

    public static void main(String[] args) {

        Worker worker = new Worker(listener, errorCallback);
        worker.start();

    }
}
