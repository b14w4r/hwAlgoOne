package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // Тестирование методов из MyArrays
    testMyArraysBinarySearch();
    // Тестирование методов из MyCollections
    testMyCollectionsBinarySearch();
  }

  // Метод для тестирования бинарного поиска в массиве
  private static void testMyArraysBinarySearch() {
    // Тест для массива byte
    byte[] byteArray = {1, 2, 3, 4, 5};
    System.out.println("Byte Array:");
    System.out.println(MyArrays.binarySearch(byteArray, (byte) 3)); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(byteArray, 0, 5, (byte) 3)); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(byteArray, (byte) 6)); // Ожидаемый результат: -6

    // Тест для массива char
    char[] charArray = {'a', 'b', 'c', 'd', 'e'};
    System.out.println("Char Array:");
    System.out.println(MyArrays.binarySearch(charArray, 'c')); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(charArray, 0, 5, 'c')); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(charArray, 'f')); // Ожидаемый результат: -6

    // Тест для массива double
    double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
    System.out.println("Double Array:");
    System.out.println(MyArrays.binarySearch(doubleArray, 3.3)); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(doubleArray, 0, 5, 3.3)); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(doubleArray, 6.6)); // Ожидаемый результат: -6

    // Тест для массива float
    float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
    System.out.println("Float Array:");
    System.out.println(MyArrays.binarySearch(floatArray, 3.3f)); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(floatArray, 0, 5, 3.3f)); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(floatArray, 6.6f)); // Ожидаемый результат: -6

    // Тест для массива int
    int[] intArray = {1, 2, 3, 4, 5};
    System.out.println("Int Array:");
    System.out.println(MyArrays.binarySearch(intArray, 3)); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(intArray, 0, 5, 3)); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(intArray, 6)); // Ожидаемый результат: -6

    // Тест для массива long
    long[] longArray = {1L, 2L, 3L, 4L, 5L};
    System.out.println("Long Array:");
    System.out.println(MyArrays.binarySearch(longArray, 3L)); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(longArray, 0, 5, 3L)); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(longArray, 6L)); // Ожидаемый результат: -6

    // Тест для массива short
    short[] shortArray = {1, 2, 3, 4, 5};
    System.out.println("Short Array:");
    System.out.println(MyArrays.binarySearch(shortArray, (short) 3)); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(shortArray, 0, 5, (short) 3)); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(shortArray, (short) 6)); // Ожидаемый результат: -6

    // Тест для обобщённого массива с компаратором
    String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
    System.out.println("Generic Array with Comparator:");
    System.out.println(MyArrays.binarySearch(stringArray, "cherry", String::compareTo)); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(stringArray, 0, 5, "cherry", String::compareTo)); // Ожидаемый результат: 2
    System.out.println(MyArrays.binarySearch(stringArray, "grape", String::compareTo)); // Ожидаемый результат: -6
  }

  // Метод для тестирования бинарного поиска в списке
  private static void testMyCollectionsBinarySearch() {
    // Тест для списка с естественным порядком
    List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    System.out.println("Integer List:");
    System.out.println(MyCollections.binarySearch(integerList, 3)); // Ожидаемый результат: 2
    System.out.println(MyCollections.binarySearch(integerList, 6)); // Ожидаемый результат: -6

    // Тест для списка с пользовательским компаратором
    List<String> stringList = new ArrayList<>(List.of("apple", "banana", "cherry", "date", "fig"));
    System.out.println("String List with Comparator:");
    System.out.println(MyCollections.binarySearch(stringList, "cherry", String::compareTo)); // Ожидаемый результат: 2
    System.out.println(MyCollections.binarySearch(stringList, "grape", String::compareTo)); // Ожидаемый результат: -6
  }
}
