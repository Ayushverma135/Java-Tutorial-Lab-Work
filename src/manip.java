import java.util.*;
public class manip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //get bit operation
        // int pos=2;
        // int bitMask=1<<pos;
        // if((bitMask & n)==0){
        //     System.out.println("bit is zero");
        // }
        // else{
        //     System.out.println("bit is one");
        // }

        //set bit operation
        // int pos=1;
        // int bitMask=1<<pos;
        // int newNumber=bitMask|n;
        // System.out.println(newNumber);

        //clear bit operation
        // int pos=2;
        // int bitMask=1<<pos;
        // int newBitMask=~(bitMask);
        // int newNumber=newBitMask&n;
        // System.out.println(newNumber);
        
        //update bit operation
        int pos =2;
        int oper=sc.nextInt();
        int bitMask=1<<pos;
        if(oper==1){
            int newNumber=bitMask|n;
            System.out.println(newNumber);
        }
        else{
            int newBitMask=~(bitMask);
            int newNumber=newBitMask&n;
            System.out.println(newNumber);
        }
    }
}   