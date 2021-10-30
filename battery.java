package com.company;

import java.util.Scanner;

public class Question2 {
    public static class Battery {
        double energy;

        Battery() {
            energy = 100;
        }

        void showLevel() {
            System.out.println("Your battery is " + energy);
        }

        void sendMsg() {
            System.out.println("Message sent");
            energy -= 2.0;
        }

        void recvMsg() {
            System.out.println("Message received");
            energy -= 1.0;
        }

        void compute() {
            System.out.println("Successfully computed");
            energy -= 1.5;
        }

        void recharge(int minutes) {
            energy += minutes / 2.0;
            if (energy >= 100)
                energy = 100;
            System.out.println("Battery recharged");
        }
    }

    public static void main(String[] args) {
        int minutes, choice;
        Battery b = new Battery();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to show battery level");
        System.out.println("Enter 2 to send message");
        System.out.println("Enter 3 to receive message");
        System.out.println("Enter 4 to compute");
        System.out.println("Enter 5 to recharge");
        System.out.println("Enter 0 to exit");
        choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    b.showLevel();
                    break;
                case 2:
                    b.sendMsg();
                    break;
                case 3:
                    b.recvMsg();
                    break;
                case 4:
                    b.compute();
                    break;
                case 5:

                    System.out.println("How many minutes do you want to charge?");
                    minutes = sc.nextInt();
                    b.recharge(minutes);
                    break;
            }
            choice = sc.nextInt();
        }
    }
}
