package PPackage;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Class2 {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {

            String s = sc.nextLine();
            HashSet<Character> h = new HashSet<>();
            for (int i1 = 0; i1 < s.length(); i1++)
                h.add(s.charAt(i1));
            System.out.println(h.size());
        }
    }
}