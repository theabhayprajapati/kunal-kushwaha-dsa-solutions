import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // getMarks();
        int[] marks = new int[10];
        System.out.println(marks.length);
        
        for (int i = 0; i < 10; i++) {
            marks[i] = in.nextInt();
            System.out.println(marks[i] + i );
        }
        System.out.println(marks);

    }

    static void getMarks() {

    }
}