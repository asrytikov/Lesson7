package p4;

public interface Accountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
