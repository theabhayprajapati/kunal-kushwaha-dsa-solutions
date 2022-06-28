
// import all from java.util;
import java.util.HashMap;

/**
 * 
 * IntegerToRoman
 */
public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(convert(3));
        System.out.println(convert(4));
        System.out.println(convert(9));
        // System.out.println(convert(58));
        // System.out.println(convert(1994));
    }
 
    public static String convert(int num) {
        // convert int to roman
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        map.put(4, "IV");
        map.put(9, "IX");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(400, "CD");
        map.put(900, "CM");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num > 0) {
            if (num >= 1000) {
                sb.append(map.get(1000));
                num -= 1000;
            } else if (num >= 900) {
                sb.append(map.get(900));
                num -= 900;
            } else if (num >= 500) {
                sb.append(map.get(500));
                num -= 500;
            } else if (num >= 400) {
                sb.append(map.get(400));
                num -= 400;
            } else if (num >= 100) {
                sb.append(map.get(100));
                num -= 100;
            } else if (num >= 90) {
                sb.append(map.get(90));
                num -= 90;
            } else if (num >= 50) {
                sb.append(map.get(50));
                num -= 50;
            } else if (num >= 40) {
                sb.append(map.get(40));
                num -= 40;
            } else if (num >= 10) {
                sb.append(map.get(10));
                num -= 10;
            } else if (num >= 9) {
                sb.append(map.get(9));
                num -= 9;
            } else if (num >= 5) {
                sb.append(map.get(5));
                num -= 5;
            } else if (num >= 4) {
                sb.append(map.get(4));
                num -= 4;
            } else if (num >= 1) {
                sb.append(map.get(1));
                num -= 1;
            }
            i++;
        }
        return sb.toString();
        
    }
}