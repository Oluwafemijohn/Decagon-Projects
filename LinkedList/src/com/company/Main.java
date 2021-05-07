package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        System.out.println("\n*********Please select the task to be carried out*********\n");
        System.out.println("\n 1. Add an element at a given position" +
                "\n 2. Delete an element at a given position\n 3. Get the size of the list\n 4. Get an element at a given positionn" );
        Scanner scObj = new Scanner(System.in);
        int choice = 1;
        int number;
        SingleLinkedList linkedList = new SingleLinkedList();
        while(choice<4) {

            choice = scObj.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter a number to add");
                    number = scObj.nextInt();
                    linkedList.insert(number);
                    break;
                case 2:
                    break;
                case 3:
                    linkedList.getSize();
                    break;
                default:
                    System.out.println("Try 1 to 4");


            }
        }
    }
}

