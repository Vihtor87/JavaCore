package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;
import java.util.Comparator;

/**
 * 1. Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты,
 * представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора
 */

@Data
@AllArgsConstructor
public class Worker {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private double salary;

    @Override
    public String toString() {
        return String.format("%s %s %s %s", firstName, lastName, birthDate, salary);
    }

//    public void upSalary(double percent) {
//        setSalary((salary + (salary * (percent / 100))));
//        }

    static class WorkerComparator implements Comparator<Worker> {

        @Override
        public int compare(Worker o1, Worker o2) {
            return o1.getBirthDate().compareTo(o2.getBirthDate());
        }
    }
}