package com.internshala.javaapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String name;
        String blood;
        int age;
        String group;

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter name:");
        name = sc.nextLine();

        System.out.println("enter bloodgroup:");
        blood=sc.nextLine();

        System.out.println("enter age:");
        age=sc.nextInt();

        sc.close();

        if(age>=20)
            group ="RED";
        else if(age>=15)
            group="BLUE";
        else
            group = "YELLOW";

        System.out.println("-----------------------------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Blood Group: "+blood);
        System.out.println("-----------------------------");
        System.out.println(" Your Group is "+group);
        System.out.println("-----------------------------");






    }

}
