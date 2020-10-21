package com.ros.g;
import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner srt = new Scanner(System.in);
        int a,b,c;
        System.out.println("a = ");
        a = srt.nextInt();
        System.out.println("b = ");
        b = srt.nextInt();
        System.out.println("c = ");
        c = srt.nextInt();
        double x1,x2,d;

        d = Math.pow(b,2) - 4*a*c;
        System.out.println(d);
        if (d>=0){
            x1 = (-b + Math.pow(d,0.5)) / (2*a);
            x2 = (-b - Math.pow(d,0.5)) / (2*a);
            System.out.println("Результат: x1 = " + x1 + "x2  = " + x2);

        }
        else {
            System.out.println("Розв'язку немає");
            System.out.print("123");

        }

    }
}
