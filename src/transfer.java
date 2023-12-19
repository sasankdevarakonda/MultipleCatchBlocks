import java.io.IOException;

public class transfer {


    public int transfermoney(int accNo, int money)throws Exception{

        int useraccNo=1234;
        int balance = 10000;

                if (useraccNo==accNo&&balance >= money) {
                    balance = balance - money;
                    System.out.println("Remaining Balance: " + balance);
                } else {
                    throw new Exception("Insufficent Funds");
                }
                return balance;

    }
    public void connection(boolean security)  {
        if(!security){
            throw new SecurityException("Network Issue Please After Some Time");
        }
    }
}
