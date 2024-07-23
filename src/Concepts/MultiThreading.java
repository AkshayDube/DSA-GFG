package Concepts;

//Two ways to implement multi threading --- 1. extending Thread class and override run method
//2. implementing runnable interface and override run method
public class MultiThreading {

    public static void main(String[] args) {
        //for firstClass thread
        FirstClass object = new FirstClass();
        object.start();

        //for SecondClass thread
        SecondClass secondClassObject = new SecondClass();
        Thread thread = new Thread(secondClassObject);
        thread.start();
    }

}

class FirstClass extends Thread {
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("Inside FirstClass Thread : " + i);
        }
    }
}

class SecondClass implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            System.out.println("Inside SecondClass Thread : " + i);
        }
    }
}