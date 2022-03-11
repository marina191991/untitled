package org.example;

import java.util.*;

/*1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
        вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Посчитать, сколько раз встречается каждое слово.
2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
        телефонных номеров. В этот телефонный справочник с помощью метода add() можно
        добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
        учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
        лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие
         с пользователем через консоль и т.д).
         Консоль использовать только для вывода результатов проверки телефонного
        справочника.*/
public class Main {
    public static void main(String[] args) {
        List<String> arrayList= new ArrayList<>(Arrays.asList("Darya","Olga","Piter","Tanya","Masha","Igor","Vova","Oleg","Piter","Fedor"
        ,"Masha"));
        MyCollectionMethod myCollectionMethod=new MyCollectionMethod();
        //Посчитать, сколько раз встречается каждое слово.
        System.out.println(myCollectionMethod.frequencyVal(arrayList));

        /* Найти и вывести список уникальных слов, из которых состоит
    массив (дубликаты не считаем). Вывести только уникальные значения*/
        System.out.println(myCollectionMethod.uniqueValue(arrayList));

/* Найти и вывести список уникальных слов, из которых состоит
    массив (дубликаты не считаем). Вывести всё, но без дубликатов*/
        System.out.println(myCollectionMethod.uniqueVal(arrayList));



//Ex.2
 System.out.println("Ex.2");

PhoneBook phoneBook= new PhoneBook();
phoneBook.add("12344455","Vladimir");
phoneBook.add("18799889","Vladimir");
phoneBook.add("12323255","Vlad");
phoneBook.add(null,"Vlad");
phoneBook.get("Vlad");

    }

}
