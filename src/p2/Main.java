package p2;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Ivan");
        System.out.println(person.toString());

        System.out.println(person.hashCode());

        Person person1 = new Person("Ivan");
        System.out.println(person1.hashCode());
        System.out.println(person1.getClass());

        System.out.println(person.equals(new Person("Mary")));

    }

}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person " + name;
    }

    @Override
    public int hashCode() {
        return 10 * name.hashCode() + 123456;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }
}
