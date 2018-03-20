package d_Arrays;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 20. Write a Java program to convert an array to LinkedList.
 */
public class e20_ArrayToArrayList {
    public static void main(String[] args) {
        int[] first  = new int[10];
        LinkedList linkedList;
        ArrayList arrayList = new ArrayList();
        // fill matrixes with int numbers
        for (int i = 0; i < first.length; i++) {
                first[i] = (int)(Math.random()*10);
        }
        System.out.println("Array: ");
        printArray(first);
        System.out.println();
        System.out.println("Linked list:");
        linkedList = arrayToLinkedList(first);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i).toString() + " ");
        }

        arrayList = arrayToArrayList(first);
        System.out.println();
        System.out.println("Array list: ");
        printArrayList(arrayList);
    }

    private static LinkedList arrayToLinkedList(int[] array){
        LinkedList linkedList = new LinkedList();
        for (int anArray : array) {
            linkedList.add(anArray);
        }
        return linkedList;
    }

    private static ArrayList arrayToArrayList(int[] array){
        ArrayList arrayList = new ArrayList();
        for (int anArray : array) {
            arrayList.add(anArray);
        }
        return arrayList;
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void printArrayList(ArrayList arrayList){
        for (Object anArrayList : arrayList) {
            System.out.print(anArrayList + " ");
        }
    }
}
