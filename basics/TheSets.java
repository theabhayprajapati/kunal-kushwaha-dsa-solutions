package basics;

import java.util.Set;

/**
 * TheSets
 */
public class TheSets {

    public static void main(String[] args) {
        Set<Ball> balls= new java.util.HashSet<>();
        balls.add(new Ball("red"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("red")); // this is not added because it is already in the set
        System.out.println(balls);
    }
         
    /**
     * InnerTheSets
     */
    public record Ball(String color) {
        
    }
}
