package org.example;

import java.util.*;

public class MyCollectionMethod <T> {
    //Посчитать, сколько раз встречается каждое слово.
    Map<T, Integer> frequencyVal(List<T> arrayList){
        Map<T,Integer> map = new HashMap<>();
        for (int i=0; i<arrayList.size();i++) {
            int freq = Collections.frequency(arrayList, arrayList.get(i));
            map.put( arrayList.get(i),freq);
        }
        return map;
    }

     /* Найти и вывести список уникальных слов, из которых состоит
    массив (дубликаты не считаем). Вывести только уникальные значения*/
    Set<T> uniqueValue (List<T> arrayList) {
        Set<T> set =new HashSet<>();
      for (int i=0; i<arrayList.size();i++) {
          int freq = Collections.frequency(arrayList, arrayList.get(i));
         if (freq==1) {
             set.add(arrayList.get(i));
         }

      } return set;    }



   /* Найти и вывести список уникальных слов, из которых состоит
    массив (дубликаты не считаем).Вывести всё, но без дубликатов*/

    Set<T> uniqueVal (List<T> arrayList) {
        Set<T> set = new HashSet<>(arrayList);
        return set;
    }

}
