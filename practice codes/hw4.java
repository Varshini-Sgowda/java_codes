class BankAccount{
    String AccountHolderName;
    double Balance;
    void deposite(double Amt){
        Balance += Amt;
    }
    void withdraw(double Amt){
        Balance -=Amt;
    }
}
    public class hw4{
        public static void main(String[] args){
            BankAccount b1=new BankAccount();
            b1.AccountHolderName="Varshini";
            b1.Balance=12000;
            b1.deposite(5400);
            b1.withdraw(2770);
            System.out.println("Balance ="+ b1.Balance);
        }
    }
