public class TowerOfHanoi {
    public static void TOH(int n,String A,String B,String C){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+A+" to "+C);
            return;
        }
        TOH(n-1,A,C,B);
        System.out.println("transfer disk "+n+" from "+A+" to "+C);
        TOH(n-1,B,A,C);
    }
    public static void main(String[] args) {
        int n=3;
        TOH(n,"A","B","C");
    }
}
