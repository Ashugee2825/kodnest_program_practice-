package concurrent;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1. ArrayList
        System.out.println("ArrayList:");
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        iterateCollection(arrayList);

        // 2. LinkedList
        System.out.println("\nLinkedList:");
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        iterateCollection(linkedList);

        // 3. ArrayDeque
        System.out.println("\nArrayDeque:");
        ArrayDeque<Double> arrayDeque = new ArrayDeque<>(Arrays.asList(1.1, 2.2, 3.3, 4.4));
        iterateCollection(arrayDeque);

        // 4. PriorityQueue
        System.out.println("\nPriorityQueue:");
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>(Arrays.asList('P', 'Q', 'R', 'S'));
        iterateCollection(priorityQueue);

        // 5. TreeSet
        System.out.println("\nTreeSet:");
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
        iterateCollection(treeSet);

        // 6. HashSet
        System.out.println("\nHashSet:");
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));
        iterateCollection(hashSet);

        // 7. LinkedHashSet
        System.out.println("\nLinkedHashSet:");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("Lion", "Tiger", "Elephant", "Giraffe"));
        iterateCollection(linkedHashSet);
    }

    // Generic method to iterate through a collection
    private static <T> void iterateCollection(Collection<T> collection) {
        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<T> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Using enhanced for-loop
        System.out.println("Using Enhanced for-loop:");
        for (T item : collection) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
