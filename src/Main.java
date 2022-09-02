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

        for (Person person : list) {
            System.out.println(person);
        }

        Comparator<Person> personComparator = (o1, o2) -> {
            final int maxWords = 2;
            int wordsInSurname1 = o1.getSurname().split("[ -]").length;
            int wordsInSurname2 = o2.getSurname().split("[ -]").length;
            int age1 = o1.getAge();
            int age2 = o2.getAge();

            if (wordsInSurname1 >= maxWords && wordsInSurname2 >= maxWords) {
                if (age1 > age2) {
                    return 1;
                }
                if (age1 == age2) {
                    return 0;
                }
                return -1;
            }

            if (wordsInSurname1 > wordsInSurname2) {
                return 1;
            }
            if (wordsInSurname1 == wordsInSurname2 && age1 > age2) {
                return 1;
            }
            if (wordsInSurname1 == wordsInSurname2 && age1 == age2) {
                return 0;
            }

            return -1;
        };

        Collections.sort(list, personComparator);

        System.out.println("\nПосле сортировки:");

        for (Person person : list) {
            System.out.println(person);
        }
    }
}