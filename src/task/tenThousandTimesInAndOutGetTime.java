package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 4. Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка

Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet должен вернуть время его исполнения в миллисекундах. */

public class tenThousandTimesInAndOutGetTime {
    tenThousandTimesInAndOutGetTime () {
        System.out.println();
        System.out.println("""
            Задание №4: Нужно выяснить, сколько времени занимает 10 тысяч вызовов каждого типа списка.
            Для этого, надо создать метод, возвращающий его время в миллисекундах""");
        System.out.println();

        System.out.println("Создаем ArrayList и вызываем его содержимое...");
        System.out.println("Задержка: " + getTimeMsOfGet(new ArrayList()) + "мс\n");

        System.out.println("Создаем LinkedList и вызываем его содержимое...");
        System.out.println("Задержка: " + getTimeMsOfGet(new LinkedList()) + "мс\n");
    }

    public static long getTimeMsOfGet(List list) {
        insert10000Times(list);
        Date beginTime = new Date();
        get10000Times(list);
        Date finishTime = new Date();
        long msDelay = finishTime.getTime() - beginTime.getTime();
        return msDelay;
    }

    public static void insert10000Times (List list) {
        for (int i = 0; i < 10000; i++)
            list.add(0,i + 1);
    }

    public static void get10000Times (List list) {
        System.out.print("Список такой: ");
        for (int i = 0; i < 10000; i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }
}