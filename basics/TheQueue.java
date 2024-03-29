package basics;

import java.util.LinkedList;
import java.util.Queue;

/**
 * TheQueue
 */
public class TheQueue {

    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("John", 19));
        supermarket.add(new Person("Jane", 20));
        supermarket.add(new Person("Jack", 21));
        System.out.println(supermarket);
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket);
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket);
        
    }

    // perosn
    static record Person(String name, int age) {

    }
}