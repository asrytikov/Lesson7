package dz2;

/*Д/з Класс Phone.
        Создайте класс dz2.Phone, который содержит переменные number, model и weight.
        Создайте три экземпляра этого класса.
        Выведите на консоль значения их переменных.
        Добавить в класс dz2.Phone методы: receiveCall, имеет один параметр – имя звонящего.
        Выводит на консоль сообщение “Звонит {name}”.
        Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
        Добавить конструктор в класс dz2.Phone,
        который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
        Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
        Добавить конструктор без параметров.

 */

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone();
        Phone phone1 = new Phone("+77777777", "Samsung XXX");
        Phone phone2 = new Phone("+999999999", "Apple XXX", 150);

        System.out.println(phone.toString());
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());

        phone.receiveCall("Ivan");
        phone1.receiveCall("Maria");
        phone2.receiveCall("Mark");

        System.out.println(phone.getNumber());
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());









    }
}