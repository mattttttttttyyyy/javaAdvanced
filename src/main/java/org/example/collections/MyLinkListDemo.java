package org.example.collections;

public class MyLinkListDemo {
    public static void main(String[] args) {
        MyNode<String> myNode = new MyNode("abc");
        MyNode<Integer> myNode1 = new MyNode(123);

        System.out.println(myNode1.getData());
        System.out.println(myNode.getData());

        String text = (String) myNode.getData();
        int number = (int) myNode1.getData();
        System.out.println(text.toUpperCase());
    }
}
