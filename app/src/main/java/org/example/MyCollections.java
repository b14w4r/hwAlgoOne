package org.example;

import java.util.Comparator;
import java.util.List;

public class MyCollections {

    // Метод для бинарного поиска в списке с естественным порядком
    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        return binarySearch(list, key, null);
    }

    // Метод для бинарного поиска в списке с указанным компаратором
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        // Если компаратор не задан, создаём компаратор по умолчанию для сравнения Comparable объектов
        if (c == null) {
            c = new Comparator<T>() {
                @SuppressWarnings("unchecked")
                public int compare(T o1, T o2) {
                    return ((Comparable<? super T>) o1).compareTo(o2);
                }
            };
        }

        int low = 0;
        int high = list.size() - 1;

        // Пока диапазон поиска не пустой
        while (low <= high) {
            int mid = (low + high) >>> 1; // Вычисление среднего индекса
            T midVal = list.get(mid);
            int cmp = c.compare(midVal, key);

            if (cmp < 0)
                low = mid + 1; // Если значение меньше ключа, сужаем диапазон
            else if (cmp > 0)
                high = mid - 1; // Если значение больше ключа, сужаем диапазон
            else
                return mid; // Если найдено совпадение, возвращаем индекс
        }
        return -(low + 1);  // Если не найдено, возвращаем отрицательное значение
    }
}
