package p7;

public class Main {

    public static void main(String[] args) {

        Account<String, Double> account = new Account<String, Double>("2334", 5000.0);
        String accountId = account.getId();
        Double sum = account.getSum();
        System.out.printf("Id: %s Sum: %f \n", accountId, sum);


    }

}
