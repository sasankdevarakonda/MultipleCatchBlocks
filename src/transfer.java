import java.io.IOException;

public class transfer {


    public int transfermoney(int accNo, int money)throws Exception {
        int balance = 10000;
                if (balance >= money) {
                    balance = balance - money;
                    System.out.println("Remaining Balance: " + balance);
                } else {
                    throw new Exception("Insufficent Funds");
                }
                return balance;
    }
    public void connection(boolean security){
        if(!security){
            throw new SecurityException();
        }
    }
}
