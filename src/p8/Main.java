package p8;

public class Main {

    public static void main(String[] args) {

        Account account = new Account("2334", 5000);
        Account account1 = new Account("3456", 1500);

        Transation<Account> transation = new Transation<Account>(account, account1, 4000);
        transation.execute();


    }

}
