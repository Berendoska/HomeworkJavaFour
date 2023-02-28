package org.example;
//Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() -
// помещает элемент в конец очереди, dequeue() - возвращает первый элемент из
// очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class ThreeMethod {
    public static void main(String[] args) {

        LinkedList<Integer> someList = new LinkedList<Integer>();
        someList.add(1);
        someList.add(2);
        someList.add(3);
        someList.add(4);


        System.out.println("Изначальный LinkedList " + someList);

        enqueue(someList, 7);
        System.out.println("Добавляем новый элемент в конец LinkedList " + someList);

        dequeue(someList);
        System.out.println("Удаляем первый элемент из LinkedList " + someList);

        first(someList);
        System.out.println("Возвращаем первый элемент LinkedList " + someList.get(0));


    }

   public static void enqueue(LinkedList<Integer> list, int number) {

       list.addLast(number);}


    public  static int dequeue(LinkedList<Integer> list) {
        list.pop();
        return 0;
    }
    public static int first(LinkedList<Integer> list) {
        list.peekFirst();

        return list.get(0);
    }
}



