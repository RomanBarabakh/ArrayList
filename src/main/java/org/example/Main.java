package org.example;

import java.util.ArrayList;

//ArrayList — це один із основних класів у Java для роботи зі списками. Він належить до пакету java.util і є частиною Java Collections Framework.
//Основна перевага ArrayList — це його динамічний розмір, тобто він може автоматично змінювати свою довжину при додаванні або видаленні елементів.
//
//Основні властивості ArrayList
//Динамічний розмір: Може збільшуватися або зменшуватися в залежності від кількості елементів.
//Індексація: Доступ до елементів здійснюється за індексом (починається з 0).
//Підтримка дженериків: Ви можете визначити тип даних, який буде зберігатися у списку.
//Не синхронізований: Паралельний доступ не є потокобезпечним (але це можна виправити).

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            numbers.add(i);
        }

        long startTime = System.nanoTime();
        int value = numbers.get(500_000);
        long endTime = System.nanoTime();

        System.out.println("Eлемент " + value);
        System.out.println("Час доступу (наносекунди): " + (endTime - startTime));


        System.out.println("------------------------------");
        //-------------------------


        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        list.add("Grape");


        // Виведення елементів
        System.out.println("Список: " + list);

        // Отримання елемента за індексом
        System.out.println("Елемент з індексом 1: " + list.get(1)); // Banana

        // Зміна елемента
        list.set(1, "Blueberry");
        System.out.println("Список після заміни: " + list);

        // Видалення елемента
        list.remove("Grape");
        System.out.println("Список після видалення: " + list);

        // Розмір списку
        System.out.println("Розмір списку: " + list.size());

        // Перевірка, чи список містить елемент
        System.out.println("Чи є 'Cherry'? " + list.contains("Cherry"));

        // Очистка списку
        list.clear();
        System.out.println("Список після очищення: " + list);


    }
}
