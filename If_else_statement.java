package com.company;
import java.util.Scanner;
public class If_else_statement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        if (age>18)
        {
            System.out.println("Yes,you can give Vote");
        }
        else
        {
            System.out.println("NO!, You cant give Vote ");
        }
     }

}
