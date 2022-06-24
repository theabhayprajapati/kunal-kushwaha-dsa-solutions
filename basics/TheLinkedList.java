package basics;

import java.util.LinkedList;

/**
 * TheLinkedList
 */
public class TheLinkedList {

    public static void main(String[] args) {
        LinkedList<Person> supermarket = new LinkedList<>();
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
    static record Person(String name, int age) {
        
    }
}