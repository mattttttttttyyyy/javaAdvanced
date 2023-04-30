package org.example.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListsMechanics {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();
        //{>null}
        System.out.println(names.size());
        names.add("Ada");
        //{("Ada") > null}
        //{>("Ada") > null}
        System.out.println(names.size());
        names.add("Iza");
        //("Iza") > null
        //{>("Iza")>("Ada")>null}
        System.out.println(names.size());
        names.add("Jan");
        System.out.println(names.size());
        names.add("Jan");
        System.out.println(names.size());
        names.add("Zofia");
        System.out.println(names.size());
        System.out.println(names);

        names.add(0, "Tom");

        //("Tom")>null
        //at 0 is: ("Ada")>("Iza)>
        //make 'tom' point 'ada'
        //("Tom")>("Ada")>
        //make linked list point to tom
        //{>{("Tom")>("Ada")>...>null}
        System.out.println(names);
    }
}

/*
class MyNode{
    private System data;
    private MyNode nextNode = null;
}
*/

