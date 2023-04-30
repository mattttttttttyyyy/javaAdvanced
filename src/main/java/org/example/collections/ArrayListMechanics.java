package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMechanics {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //[null][null][null]
        System.out.println(names.size());
        names.add("Ada");
        //["Ada"][null][null]
        System.out.println(names.size());
        names.add("Iza");
        //["Ada"]["Iza"][null]
        System.out.println(names.size());
        names.add("Jan");
        //["Ada"]["Iza"]["Jan"]
        System.out.println(names.size());
        names.add("Jan");
        //["Ada"]["Iza"]["Jan"]
        System.out.println(names.size());
        names.add("Zofia");
        System.out.println(names.size());
        System.out.println(names);

        names.add(0, "Tom");
        System.out.println(names);

    }
}
