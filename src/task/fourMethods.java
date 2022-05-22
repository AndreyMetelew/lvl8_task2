package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 5. Четыре метода

Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций
(быстрее всего справится с большим количеством операций). Ничего измерять не нужно. */

public class fourMethods {
    fourMethods () {
        System.out.println();
        System.out.println("""
                Задание №5: Нужно реализовать 4 метода, которые вернут список, лучше всего подходящий
                для выполнения операции - быстрее с ней справляется""");
        System.out.println();

        System.out.println("Создаем ArrayList и LinkedList...");
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        System.out.println("Высчитываем оптимальный вариант...");
        System.out.println();
        whichListIsFaster(list1,list2);
        System.out.println();
    }

    public static void whichListIsFaster (ArrayList<Integer> list1, LinkedList<Integer> list2) {
        long time1 = getTimeMsOfGet(list1);
        long time2 = getTimeMsOfGet(list2);
        if (time1 < time2) {
            System.out.println("Самым оптимальным оказался ArrayList.");
            get10000Times(list1);
        }
        else if (time1 > time2) {
            System.out.println("Самым оптимальным оказался LinkedList.");
            get10000Times(list2);
        }
        else System.out.println("Разницы между методами нет.");
    }

    public static long getTimeMsOfGet(List<Integer> list) {
        insert10000Times(list);
        Date beginTime = new Date();
        get10000Times(list);
        Date finishTime = new Date();
        long msDelay = finishTime.getTime() - beginTime.getTime();
        return msDelay;
    }

    public static void insert10000Times (List<Integer> list) {
        for (int i = 0; i < 10000; i++)
            list.add(i + 1);
    }

    public static void get10000Times (List<Integer> list) {
        System.out.print("Список такой: ");
        for (int i = 0; i < 10000; i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }
}