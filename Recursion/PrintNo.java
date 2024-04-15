/**
 * PrintNo
 */
public class PrintNo {

    public static void printno(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printno(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printno(n);
    }
}