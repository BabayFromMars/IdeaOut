package july07;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("ID " + Thread.currentThread().getId());
        System.out.println("Name " +Thread.currentThread().getName());
        System.out.println("State " +Thread.currentThread().getState());
        System.out.println("Priority " +Thread.currentThread().getPriority());
    }
}
