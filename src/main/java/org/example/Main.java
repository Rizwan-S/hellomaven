package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(obj.factorial(n));
    }

    public int factorial(int n) {
        int ans = 1;
        for(int i = 1; i <=n; i++) {
            ans = ans * i;
        }
        return ans;
    }
}