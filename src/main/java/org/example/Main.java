package org.example;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> someList = new LinkedList<String>();
        someList.add(0, "good");
        someList.add(1, "bad");
        someList.add(2, "ugly");
        someList.add(3, "man");

        System.out.println("LinkedList " + someList);

        Iterator<String> iterator = someList.descendingIterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

    }
}
