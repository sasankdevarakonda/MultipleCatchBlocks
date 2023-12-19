import java.io.IOException;


public class SbiBank {
    public int Security(int securityPin,int seessiontime) throws  IOException, RuntimeException{
        int loginTimeLimit = 10;
        int pin = 2502;

        if(loginTimeLimit>=seessiontime){
            loginTimeLimit = loginTimeLimit-seessiontime;
            System.out.println("Active page "+loginTimeLimit+" min");
        }else{
            throw new RuntimeException("In Active page");
        }

        if (pin == securityPin ) {
            System.out.println("Login User Successfully");
        } else {
            throw new IOException("Enter Wrong pin");
        }
       return seessiontime;
    }
}
