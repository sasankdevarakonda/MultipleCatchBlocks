import java.io.IOException;

public class Atm {
    public static void main(String args[]){
        transfer tr = new transfer();
        SbiBank sbi=new SbiBank();

        try {
            tr.connection(false);
            sbi.Security(2502,8);
            tr.transfermoney(1234, 8000);

        }catch (SecurityException e){
           System.out.println("Security Exception: "+e.getMessage());
        }
        catch (IOException e) {
            System.out.println("IO Exception: "+e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Runtime exception: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());

        }
    }
}
