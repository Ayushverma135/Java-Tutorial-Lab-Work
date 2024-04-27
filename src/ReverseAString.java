public class ReverseAString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++){
            char front =sb.charAt(i);
            char back =sb.charAt(sb.length()-1-i);
            sb.setCharAt(i,back);
            sb.setCharAt(sb.length()-1-i,front);
        }
        System.out.println(sb);
    }
}
