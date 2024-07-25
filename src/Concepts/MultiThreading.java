package Concepts;

//Two ways to implement multi threading --- 1. extending Thread class and override run method
//2. implementing runnable interface and override run method
public class MultiThreading {

    public static void main(String[] args) {
        //for firstClass thread
        FirstClass object = new FirstClass();
        System.out.println(object.getState());
        object.start();
        System.out.println(object.getState());

        //for SecondClass thread
        SecondClass secondClassObject = new SecondClass();
        Thread thread = new Thread(secondClassObject);
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());

    }

}

class FirstClass extends Thread {
    public void run() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getState());
        for (int i = 1; i < 10; i++) {
            System.out.println("Inside FirstClass Thread : " + i);
        }

    }
}

class SecondClass implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Inside SecondClass Thread : " + i);
        }
    }
}