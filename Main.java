package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please onput the numbr");
        int inputnumber = scanner.nextInt();

        if (inputnumber > 90) {
            System.out.println("Lava");
        } else if (inputnumber == 70) {
            System.out.println("Normal");
        } else if (inputnumber == 50) {
            System.out.println("vata");
        } else if (inputnumber == 30) {
            System.out.println("stugvi");
        } else if (inputnumber == 0) {
            System.out.println("mernum es");
        } else {
            System.out.println("bari taxum");
        }
    }

}

