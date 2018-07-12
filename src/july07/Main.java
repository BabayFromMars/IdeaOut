package july07;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

//=========================================================================

//=========================================================================
/*
        final Object ref = new Object();
        new Thread(new Runnable() {
            public void run() {
                synchronized (ref) {
                    System.out.println("run - wait...");
                    try {
                        ref.wait();

                        System.out.println("run - thanks!");
                    } catch (InterruptedException e) {
                        */
/*NOP*//*

                    }
                }
            }
        }).start();
        System.out.println("sleep...");
        Thread.sleep(2000);
        System.out.println("Main - sleep!");
        System.out.println("Main - notify");
        synchronized (ref) {
            ref.notify();
        }
*/


//=========================================================================
/*        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "World");

        // wait for threads to end
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }*/
//=========================================================================
/*        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");

        System.out.println("Thread One is alive: "
                + ob1.t.isAlive());
        System.out.println("Thread Two is alive: "
                + ob2.t.isAlive());
        System.out.println("Thread Three is alive: "
                + ob3.t.isAlive());
        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Thread One is alive: "
                + ob1.t.isAlive());
        System.out.println("Thread Two is alive: "
                + ob2.t.isAlive());
        System.out.println("Thread Three is alive: "
                + ob3.t.isAlive());

        System.out.println("Main thread exiting.");*/

//=========================================================================
/*        new Thread(() -> {
            System.out.println("ID " + Thread.currentThread().getId());
            System.out.println("Name " +Thread.currentThread().getName());
            System.out.println("State " +Thread.currentThread().getState());
            System.out.println("Priority " +Thread.currentThread().getPriority());
        }).start();*/

/*        System.out.println("ID " + Thread.currentThread().getId());
        System.out.println("Name " +Thread.currentThread().getName());
        System.out.println("State " +Thread.currentThread().getState());
        System.out.println("Priority " +Thread.currentThread().getPriority());*/


//        new Thread(new MyThreadI()).start();

/*        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();*/
//=========================================================================
/*
        Student goncharenko = new Student("MMF", "Goncharenko", 1, "G017s9");
        System.out.println(goncharenko);
        File fw = new File("demo1.txt");

        ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
        ostream.writeObject(goncharenko);
        ostream.close();

        Student.faculty = "GEO";

        File fr = new File("demo1.txt");
        ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr));
        Student unknown = (Student) istream.readObject();
        System.out.println(unknown);
*/

//=========================================================================
/*        try(Stream<Path> entries = Files.list(Paths.get("."))) {
            entries.forEach(System.out::println);
        }*/

//=========================================================================

/*        Path pathSource = Paths.get("aa3.txt");
        Files.delete(pathSource);*/

//=========================================================================

/*        List<String> lines = Files.readAllLines(Paths.get("source.txt"));
        lines.forEach(System.out::println);*/
//=========================================================================
       /* Files.copy(Paths.get("source.txt"), Paths.get("aa3.txt"));*/

    }
}
