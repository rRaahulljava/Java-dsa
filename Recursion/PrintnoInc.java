public class PrintnoInc {
    public static void printnoInc(int a){
        if(a == 1){
            System.out.print(a+" ");
            return;

        }
        printnoInc(a-1);
        System.out.print(a+" ");

    }
    public static void main(String[] args) {
        int n = 7;
        printnoInc(n);
    }
}
