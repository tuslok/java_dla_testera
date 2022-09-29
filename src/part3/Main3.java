package part3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        //ArrayList
        //[Element1, Element2, Element3]
        //[   0    ,     1   ,     2   ]

        //LinkedList
        //[Element1 <-> Element2 <-> Element3]

        List<String> names1 = new ArrayList<>();
        List<String> names2 = new LinkedList<>();

        names1.add("Marek");
        names2.add("Jerzy");

        names1.get(0);
        names2.get(0);

        names1.remove(0);
        names2.remove(0);

    }
}
