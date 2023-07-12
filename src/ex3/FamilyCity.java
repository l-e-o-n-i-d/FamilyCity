package ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Програма визначає, яка сім'я (прізвище) живе у місті:
 * Приклад введення:
 * · москва
 * · Іванови
 * · Київ
 * · Петрови
 * · Лондон
 * · Абрамовичі
 * Приклад введення:
 * · Лондон
 * Приклад виведення:
 * · Абрамовичі
 */

public class FamilyCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> families = new HashMap<>();
        families.put("Мілан", "Брунови");
        families.put("Київ", "Шевченкові");
        families.put("Лондон", "Абрамовичі");
        System.out.println("Введіть назву міста:");
        String town = sc.nextLine();
        if (families.containsKey(town)){
            System.out.println(families.get(town));
        }else {
            System.out.println("Відсутня родина у введенному місті");
        }
    }
}
