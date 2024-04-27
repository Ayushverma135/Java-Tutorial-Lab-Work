package bank;

class Account{
     public String name;
     protected String email;
     private String password;

     //getters and setters
     public String getPassword(){
        return this.password;
     }
     public void setPassword(String pass){
        this.password=pass;
     }
}
public class Bank {
    public static void main(String args[]){
        Account acc1=new Account();
        acc1.name="ayush verma";
        acc1.email="xyx@gmail.com";
        acc1.setPassword("abs");
        System.out.println(acc1.getPassword());
    }
}
