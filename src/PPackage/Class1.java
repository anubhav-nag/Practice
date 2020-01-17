package PPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = new char[s.length() / 2 + 1];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3') {
                arr[x] = s.charAt(i);
                ++x;
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++)
            System.out.print(arr[i]+"+");
            System.out.print(arr[arr.length-1]);
    }
}