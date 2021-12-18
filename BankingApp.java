

public class BankingApp {
    public static void main(String[] args) {
        Account ac = new Account("12345" , 0.0,"Sojwal" , "Sojwal@123", " 8309473829");
        ac.DepositeMponey(100);
        ac.DepositeMponey(5000);
        ac.withdrawelMoney(400);
        ac.withdrawelMoney(4000);
        ac.withdrawelMoney(800);
    }
}
