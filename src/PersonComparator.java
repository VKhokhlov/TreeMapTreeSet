import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int wordsInSurname1 = o1.getSurname().split(" ").length;
        int wordsInSurname2 = o2.getSurname().split(" ").length;
        int age1 = o1.getAge();
        int age2 = o2.getAge();

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
    }
}
