package org.example;

import java.util.HashMap;
import java.util.Map;

/*2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
        телефонных номеров. В этот телефонный справочник с помощью метода add() можно
        добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
        учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять
        лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие
        с пользователем через консоль и т.д).
        Консоль использовать только для вывода результатов проверки телефонного
        справочника.*/
public class PhoneBook {
    private Map<String,String> map = new HashMap<>();

    public PhoneBook() {
        this.map = map;
    }

    void add(String number, String lastName) {
        map.put(number,lastName);
    }
    void get(String lastName) {
         if (map.containsValue(lastName)) {
           for(Map.Entry entry : map.entrySet()){
               if (entry.getValue().equals(lastName)) {
                   System.out.println(lastName+ " = "+ entry.getKey());
               }
           }
      }
         else System.out.println("Фамилии нет в базе данных");




    }




}
