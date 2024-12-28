package org.example;

import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // Test cases for Arrays class
    testArraysBinarySearch();
    // Test cases for Collections class
    testCollectionsBinarySearch();
  }

  private static void testArraysBinarySearch() {
    // Test byte array
    byte[] byteArray = { 1, 2, 3, 4, 5 };
    System.out.println("Byte Array:");
    System.out.println(MyArrays.binarySearch(byteArray, (byte) 3)); // Output: 2
    System.out.println(MyArrays.binarySearch(byteArray, 0, 5, (byte) 3)); // Output: 2
    System.out.println(MyArrays.binarySearch(byteArray, (byte) 6)); // Output: -6

    // Test char array
    char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
    System.out.println("Char Array:");
    System.out.println(MyArrays.binarySearch(charArray, 'c')); // Output: 2
    System.out.println(MyArrays.binarySearch(charArray, 0, 5, 'c')); // Output: 2
    System.out.println(MyArrays.binarySearch(charArray, 'f')); // Output: -6

    // Test double array
    double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
    System.out.println("Double Array:");
    System.out.println(MyArrays.binarySearch(doubleArray, 3.3)); // Output: 2
    System.out.println(MyArrays.binarySearch(doubleArray, 0, 5, 3.3)); // Output: 2
    System.out.println(MyArrays.binarySearch(doubleArray, 6.6)); // Output: -6

    // Test float array
    float[] floatArray = { 1.1f, 2.2f, 3.3f, 4.4f, 5.5f };
    System.out.println("Float Array:");
    System.out.println(MyArrays.binarySearch(floatArray, 3.3f)); // Output: 2
    System.out.println(MyArrays.binarySearch(floatArray, 0, 5, 3.3f)); // Output: 2
    System.out.println(MyArrays.binarySearch(floatArray, 6.6f)); // Output: -6

    // Test int array
    int[] intArray = { 1, 2, 3, 4, 5 };
    System.out.println("Int Array:");
    System.out.println(MyArrays.binarySearch(intArray, 3)); // Output: 2
    System.out.println(MyArrays.binarySearch(intArray, 0, 5, 3)); // Output: 2
    System.out.println(MyArrays.binarySearch(intArray, 6)); // Output: -6

    // Test long array
    long[] longArray = { 1L, 2L, 3L, 4L, 5L };
    System.out.println("Long Array:");
    System.out.println(MyArrays.binarySearch(longArray, 3L)); // Output: 2
    System.out.println(MyArrays.binarySearch(longArray, 0, 5, 3L)); // Output: 2
    System.out.println(MyArrays.binarySearch(longArray, 6L)); // Output: -6

    // Test short array
    short[] shortArray = { 1, 2, 3, 4, 5 };
    System.out.println("Short Array:");
    System.out.println(MyArrays.binarySearch(shortArray, (short) 3)); // Output: 2
    System.out.println(MyArrays.binarySearch(shortArray, 0, 5, (short) 3)); // Output: 2
    System.out.println(MyArrays.binarySearch(shortArray, (short) 6)); // Output: -6

    // Test generic array with Comparator
    String[] stringArray = { "apple", "banana", "cherry", "date", "fig" };
    System.out.println("Generic Array with Comparator:");
    System.out.println(MyArrays.binarySearch(stringArray, "cherry", String::compareTo)); // Output: 2
    System.out.println(MyArrays.binarySearch(stringArray, 0, 5, "cherry", String::compareTo)); // Output: 2
    System.out.println(MyArrays.binarySearch(stringArray, "grape", String::compareTo)); // Output: -6
  }

  private static void testCollectionsBinarySearch() {
    // Test list with natural ordering
    List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    System.out.println("Integer List:");
    System.out.println(MyCollections.binarySearch(integerList, 3)); // Output: 2
    System.out.println(MyCollections.binarySearch(integerList, 6)); // Output: -6

    // Test list with custom comparator
    List<String> stringList = new ArrayList<>(List.of("apple", "banana", "cherry", "date", "fig"));
    System.out.println("String List with Comparator:");
    System.out.println(MyCollections.binarySearch(stringList, "cherry", String::compareTo)); // Output: 2
    System.out.println(MyCollections.binarySearch(stringList, "grape", String::compareTo)); // Output: -6
  }
}
