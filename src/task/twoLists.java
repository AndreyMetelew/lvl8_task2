package task;

import java.util.ArrayList;
import java.util.LinkedList;

/* 1. Создать два списка LinkedList & ArrayList.

Нужно создать два списка – LinkedList и ArrayList. */

public class twoLists {
    twoLists () {
        System.out.println();
        System.out.println("""
                Задание №1: Нужно создать два списка – LinkedList и ArrayList.""");
        System.out.println();

        ArrayList<Object> arrayList = new ArrayList<>();
        System.out.println("ArrayList создан");
        System.out.println();

        LinkedList<Object> linkedList = new LinkedList<>();
        System.out.println("LinkedList создан");
        System.out.println();
    }

}