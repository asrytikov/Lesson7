package p5;

public class Main {

    public static void main(String[] args) {

        Account<String> account = new Account<String>("2334", 5000);
        String accountId = account.getId();
        System.out.println(accountId);

    }

}
