import java.io.IOException;


public class SbiBank {
    public int Security(int seessiontime,int securityPin) throws RuntimeException, IOException {
        int loginTimeLimit = 10;
        int pin = 2502;
        if(loginTimeLimit>seessiontime){
            loginTimeLimit = loginTimeLimit-seessiontime;
            System.out.println("Active page "+loginTimeLimit+" min");
        }else{
            throw new RuntimeException("In Active page");
        }

        if (pin == securityPin ) {
            System.out.println("Login User Successfully");
            System.out.println("Transfer Amount");
        } else {
            throw new NullPointerException("Enter Wrong pin");
        }
           return loginTimeLimit;
       // throw new IOException("Please Contact Your Bank");
    }

}
