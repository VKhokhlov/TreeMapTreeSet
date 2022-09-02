import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Алексей", "Орлов-Чесменский", 35));
        list.add(new Person("Александр", "Суворов-Рымникский", 32));
        list.add(new Person("Анна", "Богалий-Титовец", 30));
        list.add(new Person("Иван", "Иванов", 16));
        list.add(new Person("Мария", "де Лос Анхелес Дюран де Лемос", 15));

        printList("До удаления (18-):", list);

        list.removeIf((person) -> person.getAge() < 18);

        printList("\nПосле удаления (18-):", list);

        Collections.sort(list, new PersonComparator(2));

        printList("\nПосле сортировки:", list);
    }

    public static void printList(String msg, List<Person> list) {
        System.out.println(msg);

        for (Person person : list) {
            System.out.println(person);
        }
    }
}