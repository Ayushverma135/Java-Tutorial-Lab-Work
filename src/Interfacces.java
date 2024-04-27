interface Animal{
    int eyes=2;
    void walk();
    
}
interface Herbivore{

}
//multiple inheritance

class Horse implements Animal,Herbivore {
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
public class Interfacces {
    public static void main(String[] args) {
        
    }
}
