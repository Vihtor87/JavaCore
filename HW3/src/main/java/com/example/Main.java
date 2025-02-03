package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //task 1
        Worker w1 = new Worker("Сергей", "Иванов",
                LocalDate.of(2011, 10,21), 150);
        Worker w2 = new Worker("Василий", "Иванов",
                LocalDate.of(2010, 9, 11), 200);

        List<Worker> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);

        Worker.WorkerComparator wC = new Worker.WorkerComparator();
        list.sort(wC);
        System.out.printf("Сортированный список работников: " + list);
        System.out.println("\n");

        //task2
        Worker w3 = new Worker("Григорий", "Васильев",
                LocalDate.of(2009, 11, 12), 210);
        Supervisor supervisor1 = new Supervisor("Николай", "Петров",
                LocalDate.of(2000, 9, 11), 300);

        Worker[] list1 = {w1, w2, w3, supervisor1};

        System.out.printf("Список работников до повышения ЗП: " + Arrays.toString(list1));
        System.out.println("\n");

        supervisor1.upSalary(list1, 10);

        System.out.printf("Список работников после повышения ЗП: " + Arrays.toString(list1));
    }
}