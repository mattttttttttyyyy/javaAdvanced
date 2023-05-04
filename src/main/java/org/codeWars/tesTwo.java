package org.codeWars;

import java.util.Arrays;
import java.util.Objects;

public class tesTwo {
    public static void main(String[] args) {
        String s = ("Boat Rudder Mast Boat Hull Water Fire Boat Deck Hull Fire Propeller Deck Fire Deck Boat Mast");
        s = s.replaceAll("Fire", "~~");
        System.out.println(s);
    }


}
