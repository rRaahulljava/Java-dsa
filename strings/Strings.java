import java.util.Arrays;
import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] ch = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz"); 
        System.out.println(Arrays.toString(ch));

        //String name = in.next(); ,next() function is take only one word or word before the space so we use .nextLine() funtion it can take a whole line as input
        System.out.println("enter the name :");
        String name = in.nextLine();
        System.out.println(name);   

        // length of String can be find by  .length() function 
        // while count the letter its also include space

        String Name = "tony stark";
        int len = Name.length();
        System.out.println(len);

        // concatenation its is ud=sed to add two or more string together

        String fname = "tony";
        String lname = "stark";

        String fullname = fname + " " + lname;
        System.out.println(fullname);

        // to get the character of a string at any index we use .charAt(index)

        String nikename = "kitto";
        char cha = nikename.charAt(0);
        System.out.println(cha);
        printletter(nikename);

        


    }
    // function to print all the letter of a string
    public static void printletter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}