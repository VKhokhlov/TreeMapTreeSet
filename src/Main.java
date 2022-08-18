import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Алексей", "Орлов-Чесменский", 35));
        list.add(new Person("Александр", "Суворов-Рымникский", 32));
        list.add(new Person("Анна", "Богалий-Титовец", 30));
        list.add(new Person("Иван", "Иванов", 20));
        list.add(new Person("Мария", "де Лос Анхелес Дюран де Лемос", 25));

        System.out.println("До сортировки:");

        for (Person person:list) {
            System.out.println(person);
        }

        Collections.sort(list, new PersonComparator());

        System.out.println("\nПосле сортировки:");

        for (Person person:list) {
            System.out.println(person);
        }
    }
}