package p3;

public class Main {

    public static void main(String[] args) {

        Account<String> account = new Account<String>("2334", 5000);
        String accountId = account.getId();
        System.out.println(accountId);

        Account<Integer> account2 = new Account<Integer>(2334, 5000);
        Integer accountId2 = account2.getId();
        System.out.println(accountId2);


    }

}
