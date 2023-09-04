package p6;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] people = {"Ivan", "Mary", "Nikolay"};
        Integer[] numbers = {1,2,3,4,5};
        printer.<String>print(people);
        printer.<Integer>print(numbers);
    }
}

class Printer{

    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }

}
