package Stack;

import java.util.Arrays;

public class TwoStack {
    private final int[] stack;
    private final int capacity;
    private int top1;
    private int top2;

    public static void main(String[] args) {
        //Sample Data
        TwoStack twoStack = new TwoStack(10);
        twoStack.push1(1);
        twoStack.push1(2);
        twoStack.push1(3);
        twoStack.push1(4);
        twoStack.push1(5);
        twoStack.push1(6);
        twoStack.push1(7);
        twoStack.push1(8);
        twoStack.push2(9);
        twoStack.push2(10);
        //twoStack.push1(10); //Uncomment it to throw exception
        System.out.println(twoStack.pop2());
        System.out.println(twoStack.pop2());
        //System.out.println(twoStack.pop2()); //Uncomment it to throw exception
        System.out.println(twoStack);
    }

    public TwoStack(int capacity) {
        stack = new int[capacity];
        this.capacity = capacity;
        top1 = -1;
        top2 = capacity;
    }

    public void push1(int value) {
        if (top1 < top2 - 1) {
            stack[++top1] = value;
        } else throw new RuntimeException("Insertion Not Possible : Stack Full");
    }

    public void push2(int value) {
        if (top1 < top2 - 1) {
            stack[--top2] = value;
        } else throw new RuntimeException("Insertion Not Possible : Stack Full");
    }

    public int pop1() {
        if (top1 >= 0) {
            int popElement = stack[top1--];
            return popElement;
        } else throw new RuntimeException("Deletion Not Possible : Stack Empty ");
    }

    public int pop2() {
        if (top2 < capacity) {
            int popElement = stack[top2++];
            return popElement;
        } else throw new RuntimeException("Deletion Not Possible : Stack Empty ");
    }

    public int size1() {
        return top1 + 1;
    }

    public int size2() {
        return capacity - top2;
    }

    @Override
    public String toString() {
        return "TwoStack{" +
                "arr=" + Arrays.toString(stack) +
                '}';
    }

}

