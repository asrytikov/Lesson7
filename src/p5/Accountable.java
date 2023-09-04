package p5;

public interface Accountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
