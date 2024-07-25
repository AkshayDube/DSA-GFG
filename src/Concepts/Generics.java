package Concepts;

public class Generics {
    public static void main(String[] args) {
        Sample<Integer> integerValue = new Sample<>(25);
        printValue(integerValue.message);
        Sample<Double> doubleValue = new Sample<>(25.85);
        printValue(doubleValue.message);
        Sample<String> stringValue = new Sample<>("Sample String");
        printValue(stringValue.message);
        printValue(getNumber(25));
        printValue(getNumber(85.89));
        printValue(getSum(57, 98.99));
        printValue(getSum(98, 1250.69));
    }

    static <T> void printValue(T value) {
        System.out.println(value);
    }

    static <T extends Number> T getNumber(T number) {
        return number;
    }

    static <T1 extends Number> double getSum(T1 num1, T1 num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}

class Sample<T> {
    T message;

    Sample(T obj) {
        this.message = obj;
    }
}
