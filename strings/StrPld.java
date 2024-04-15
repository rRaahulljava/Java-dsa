/**
 * Check_String_pld
 */
public class StrPld {

    public static boolean ispld(String str){

        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static boolean ispld2(String str){
        int s = 0;
        int e = str.length() - 1;
        while (s <= e) {
            if(str.charAt(s) != str.charAt(e - s)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(ispld(str));
        System.out.println(ispld2(str));

    }
}