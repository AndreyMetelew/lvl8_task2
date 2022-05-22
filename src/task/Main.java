package task;

public class Main {

    public static void main(String[] args) {
        // Вывод задания №1
        twoLists task1 = new twoLists();

        // Вывод задания №2
        tenThousandTimesInAndOut task2 = new tenThousandTimesInAndOut();
        task2.setArrayList();
        task2.setLinkedList();
        task2.getArrayList();
        task2.getLinkedList();
        System.out.println();
        task2.removeFromArrayList();
        task2.removeFromLinkedList();
        task2.getArrayList();
        task2.getLinkedList();

        // Вывод задания №3
        tenThousandTimesInAndOutInsertTime task3 = new tenThousandTimesInAndOutInsertTime();

        // Вывод задания №4
        tenThousandTimesInAndOutGetTime task4 = new tenThousandTimesInAndOutGetTime();

        // Вывод задания №5
        fourMethods task5 = new fourMethods();
    }
}