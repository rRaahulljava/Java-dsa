package Arrays;

import java.util.Scanner;

public class ArrayCC {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int marks[] = new int[50];
    int number[] = {1, 3, 4};

    String fruits[] = {"apple", "mango"};
    System.out.println();

    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();

    System.out.println("phy :" + marks[0]);
    System.out.println("math :" + marks[1]);
    System.out.println("chem :" + marks[2]);

    int len = marks.length;
    System.out.println(len);
 
   }
    
}
