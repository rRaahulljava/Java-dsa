public class SubString {
    public static String subString(String str, int s, int e){
        String SubStr = "";
        for (int i = s; i < e; i++) {
            SubStr += str.charAt(i);
            
        }
        return SubStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(0,3));
        System.out.println(subString(str, 0, 6));
    }
}
