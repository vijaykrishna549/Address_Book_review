package com.bridgelabz.review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class AddressBook_Main {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Welcome to AddressBook");
        List<String> AddressBook;
        AddressBook = new ArrayList<>();
        System.out.println("enter first name");
        AddressBook.add(sc.next());
        System.out.println("enter last name");
        AddressBook.add(sc.next());
        System.out.println("enter address");
        AddressBook.add(sc.next());
        System.out.println("enter city");
        AddressBook.add(sc.next());
        System.out.println("enter state");
        AddressBook.add(sc.next());
        System.out.println("enter zip");
        AddressBook.add(sc.next());
        System.out.println("enter phone");
        AddressBook.add(sc.next());
        System.out.println("enter email");
        AddressBook.add(sc.next());

    }
}
