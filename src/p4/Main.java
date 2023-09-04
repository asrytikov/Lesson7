package p4;

public class Main {

    public static void main(String[] args) {
        Accountable<String> account = new Account("2334", 5000);
        String accountId = account.getId();
        System.out.println(accountId);

        Account account1 = new Account("1234", 1000);
        System.out.println(account1.getId());
    }

}
