package java;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = in.nextInt();
        in.close();
        boolean vote = CheckVote(age);
        System.out.println(vote);

    }

    static boolean CheckVote(int age) {
        if (age < 18) {
            return false;
        } else {
            return true;
        }
    }
}