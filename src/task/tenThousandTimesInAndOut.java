package task;

import java.util.ArrayList;
import java.util.LinkedList;

/* 2. Провести 10 тысяч вставок, удалений

Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set. */

public class tenThousandTimesInAndOut {

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();

    tenThousandTimesInAndOut () {
        System.out.println();
        System.out.println("""
            Задание №2: Нужно создать два списка – LinkedList и ArrayList.
            Для них надо провести 10 тысяч вставок и удалений, а так же вызвать get и set""");
        System.out.println();
    }

    public void setArrayList() {
        for (int i = 0; i < 10000; i++)
            arrayList.add(i + 1);
    }

    public void setLinkedList() {
        for (int i = 0; i < 10000; i++)
            linkedList.add(i + 1);
    }

    public void getArrayList() {
        System.out.print("Список ArrayList такой: ");
        for (int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i) + " ");
        System.out.println();
    }

    public void getLinkedList() {
        System.out.print("Список LinkedList такой: ");
        for (int i = 0; i < arrayList.size(); i++)
            System.out.print(linkedList.get(i) + " ");
        System.out.println();
    }

    public void removeFromArrayList() {
        for (int i = 0; i < 10000; i++)
            arrayList.remove(0);
    }

    public void removeFromLinkedList() {
        for (int i = 0; i < 10000; i++)
            linkedList.remove(0);
    }
}