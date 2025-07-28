import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Areacalculator
{
    public static void main(String[] args) throws java.lang.Exception
    {
        double area = 0;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Here is the Area Calculation of triangle");

        System.out.println("What is the Hight of the Triangle");
        double hight = scanner.nextDouble();

        System.out.println("What is the width of the Triangle");
        double width = scanner.nextDouble();

        area = width * hight;

        System.out.println("The area of given height and width is "+ area);

        if (area > 10){
            System.out.println("The area is grater than 10");
        }
        else{
            System.out.println("The area is small");
        }

        scanner.close();

    }
}