package Concepts;

public class Generics {
    public static void main(String[] args) {
        Sample<Integer> integerValue = new Sample<>(25);
        System.out.println(integerValue.message);
        Sample<Double> doubleValue = new Sample<>(25.85);
        System.out.println(doubleValue.message);
        Sample<String> stringValue = new Sample<>("Sample String");
        System.out.println(stringValue.message);
    }
}

class Sample<T> {
    T message;

    Sample(T obj) {
        this.message = obj;
    }
}
