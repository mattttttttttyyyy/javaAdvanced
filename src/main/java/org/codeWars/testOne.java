package org.codeWars;

import java.util.ArrayList;

public class testOne {
    public static void main(String[] args) {
        System.out.println(nthEven(1298734));
    }

    public static int nthEven(int n) {
        // write your code here
        int result = 0;
        int count = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        for (int i = 0; i < (n*2 + 1); i++) {
            if (i%2 == 0){
                numbers.add(i);
            }


        }


        return numbers.get(n);

    }
}