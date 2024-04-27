public class PrintStringReverse {
    public static void StrRev(int idx,String str){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        StrRev(idx-1,str);
    }
    public static void main(String[] args) {
        String str="abcde";
        StrRev(str.length()-1,str);
    }
}
