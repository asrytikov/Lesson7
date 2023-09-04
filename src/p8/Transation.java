package p8;

public class Transation<T extends Account> {

    private T from;
    private T to;
    private int sum;

    public Transation(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute(){
        System.out.println("Money");
    }
}
