package org.example.View;
import java.util.Scanner;

public class Menu {
    public String switchMenu(){
        System.out.println("Меню: \n" +
                "1 - Добавить нового сотрудника\n" +
                "2 - Найти сотрудников по стажу\n" +
                "3 - Найти номер телефона по имени сотрудника\n" +
                "4 - Найти сотрудника по табельному номеру\n" +
                "5 - Показать всех сотрудников\n" +
                "6 - Выход");
        System.out.print("\nВыберите функцию: \n");
        return new Scanner(System.in).next();
    }
}
