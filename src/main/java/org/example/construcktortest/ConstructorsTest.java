package org.example.construcktortest;

public class ConstructorsTest {
    public static void main(String[] args) {
        // A a = new A();
        B b = new B();

    }


}


class A {



    public A() {
        System.out.println("call without passing value");
    }

    public A(int num) {
        super();// this must always be the first statement in constructor body
        System.out.println("A created " + num);
    }

    public A(String text) {
        super(); // in this case it calls Object constructor
        System.out.println("A created " + text);
    }
}

class B extends A{
    private int number = 1; // i cannot pass this value before super(); is executed

    public B() {
        super(123); //i have to type this if B don't have default constructor, to pass values
        System.out.println("B created");
    }
}