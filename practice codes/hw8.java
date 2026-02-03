class Atm{
    double balance;
    void deposite(double amt){
        balance += amt;
    }
    void withdraw(double amt){
        balance -=amt;
    }
    void checkbalance(){
        System.out.println(balance);
    }
}
public class hw8{
    public static void main(String[] args){
        Atm ac=new Atm();
        ac.deposite(12000);
        ac.withdraw(2300);
        ac.checkbalance();
    }
}