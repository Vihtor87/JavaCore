package com.example;

import java.time.LocalDate;

/**
 * 2. Опишите класс руководителя, наследник от сотрудника.
 * Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
 * чтобы он мог поднять заработную плату всем, кроме руководителей.
 * В основной программе создайте руководителя и поместите его в общий массив сотрудников.
 * Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */

public class Supervisor extends Worker {

    public Supervisor(String firstName, String lastName, LocalDate birthDate, int salary) {
        super(firstName, lastName, birthDate, salary);
    }

    public void upSalary(Worker[] workers, double percent) {
        for (Worker worker : workers) {
            double salary = worker.getSalary();
            if (!(worker instanceof Supervisor)) {
                worker.setSalary(salary + (salary * (percent / 100)));
            }
        }
    }
}
