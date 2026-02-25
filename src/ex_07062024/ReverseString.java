package ex_07062024;

public class ReverseString {
    public static void main(String[] args) {
        String original = "Automation";
        StringBuilder sb = new StringBuilder(original);
        sb.reverse();
        System.out.println("Original String: "  + original);
        System.out.println("Reverse String: "  + sb);
    }
}
