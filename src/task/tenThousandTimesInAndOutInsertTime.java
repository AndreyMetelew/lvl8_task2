package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 3. Измерить сколько времени занимает 10 тысяч вставок для каждого списка

Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert должен вернуть время его исполнения в миллисекундах. */

public class tenThousandTimesInAndOutInsertTime {

    tenThousandTimesInAndOutInsertTime () {
        System.out.println();
        System.out.println("""
            Задание №3: Нужно выяснить, сколько времени занимает 10 тысяч вставок для каждого типа списка.
            Для этого, надо создать метод, возвращающий его время в миллисекундах""");
        System.out.println();

        System.out.println("Создаем ArrayList...");
        System.out.println("Его задержка: " + getTimeMsOfInsert(new ArrayList()) + "мс\n");

        System.out.println("Создаем LinkedList...");
        System.out.println("Его задержка: " + getTimeMsOfInsert(new LinkedList()) + "мс\n");
    }

    public static long getTimeMsOfInsert(List list) {
        Date beginTime = new Date();
        insert10000Times(list);
        Date finishTime = new Date();
        long msDelay = finishTime.getTime() - beginTime.getTime();
        return msDelay;
    }

    public static void insert10000Times(List list) {
        for (int i = 0; i < 10000; i++)
            list.add(0, i + 1);
    }

}