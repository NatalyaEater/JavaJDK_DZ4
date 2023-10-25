package org.example.Model;
import java.util.List;
import java.util.Scanner;
public class NewWorker {
    public void newWorker(List<Work> workerList) {
        workerList.add(new Work(
                inputPhone(),
                inputName(),
                inputStage()));
    }

    public int inputId(){
        System.out.print("ID сотрудника : ");
        return new Scanner(System.in).nextInt();
    }
    public String inputName(){
        System.out.print("Введите имя сотрудника: ");
        return new Scanner(System.in).next();
    }

    public String inputPhone() {
        System.out.print("Введите номер телефона сотрудника: ");
        return new Scanner(System.in).next();
    }

    public Integer inputStage() {
        System.out.print("Введите стаж сотрудника: ");
        return new Scanner(System.in).nextInt();
    }
}
