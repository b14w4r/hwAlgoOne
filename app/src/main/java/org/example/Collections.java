package org.example;

import java.util.Comparator;
import java.util.List;

public class Collections {

    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        return binarySearch(list, key, null);
    }

    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
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

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = list.get(mid);
            int cmp = c.compare(midVal, key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
}

