package algorithms;

import objects.Person;
import utils.DisplayUtils;

/**
 * This class was made by Robert Lafore to show how we can sort objects based on String values. That case is most common on a normal day of a software developer that the examples of others algorithms with simple data structures like an Array.
 *
 * @author Allan G. Rizza
 */
public class ObjectSort extends LaforeAlgorithm {
    public void sort(Person[] persons) {
        for(int i = 1; i < persons.length; i++) {
            Person temp = persons[i];
            int j = i;
            while(j > 0 && persons[j-1].getLastName().compareTo(temp.getLastName()) > 0) {
                persons[j] = persons[j-1];
                --j;
            }
            persons[j] = temp;
        }
    }

    public static void example() {
        ObjectSort objectSort = new ObjectSort();

        DisplayUtils.displayStartAlgorithm(objectSort);

        Person[] persons = {
                new Person("Allan", "Rizza", 19),
                new Person("Kimberlly", "Cardoso", 20),
                new Person("Allane", "Borges", 25),
                new Person("Keilane", "Martins", 23),
                new Person("Marcelo", "Prado", 25),
                new Person("Wayner", "Maia", 25),
                new Person("Robert", "Lafore", 84)};

        System.out.println("ORIGINAL ARRAY:");
        for(Person person : persons) {
            System.out.println(person.toString());
        }

        System.out.println("\n");

        objectSort.sort(persons);

        System.out.println("SORTED (BY LAST NAME) ARRAY AFTER OBJECT SORT ALGORITHM:");

        for(Person person : persons) {
            System.out.println(person.toString());
        }

        DisplayUtils.displayEndAlgorithm(objectSort);
    }
}
