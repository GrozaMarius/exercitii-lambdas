package fasstrackit.curs17homework;

import fasstrackit.curs17.TryStreams;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ExercitiiLambdas {
    public static List<Person> persons;

    public static void listPersons() {
        persons=List.of(
                new Person("Ciurescu", "Ana", 32, "Braila"),
                new Person("Blodor", "Mihai", 22, "Oradea"),
                new Person("Petrica", "George", 12, "Oradea"),
                new Person("Petrut", "Laurentiu", 52, "Cluj"),
                new Person("Pusca", "Ecaterina", 32, "Cluj"),
                new Person("Puscas", "Darius", 26, "Oradea"),
                new Person("Puscas", "Darius", 64, "Oradea"),
                new Person("Puscas", "Arius", 29, "Oradea"),
                new Person("Anton", "Crina", 33, "Oradea")
        );
    }

    public static List<String> ex1() {
        List<String> names=persons.stream()
                .map(Person::getFullName)
                .collect(Collectors.toList());

        System.out.println("Print full names: " + names);

        return names;
    }

    public static List<Person> ex2() {
        List<Person> major=persons.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());

        System.out.println("Major persons: " + major);

        return major;
    }

    public static List<Person> ex3() {
        List<Person> fromOradea=persons.stream()
                .filter(person -> person.getCity() == "Oradea")
                .collect(Collectors.toList());

        System.out.println("From Oradea: " + fromOradea);

        return fromOradea;
    }

    public static List<Person> ex4() {
        List<Person> fromOradeaorCluj=persons.stream()
                .filter(person -> person.getCity() == "Oradea" || person.getCity() == "Cluj")
                .collect(Collectors.toList());

        System.out.println("From Oradea or Cluj: " + fromOradeaorCluj);

        return fromOradeaorCluj;
    }

    public static List<String> ex5() {
        List<String> CAPITALIZED=persons.stream()
                .map(Person::getFirstName)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("First name to uppercase: " + CAPITALIZED);

        return CAPITALIZED;
    }

    public static List<String> ex6() {
        List<String> firstNamefirstLetter=persons.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName().charAt(0) + ".")
                .collect(Collectors.toList());

        System.out.println("first name first letter: " + firstNamefirstLetter);

        return firstNamefirstLetter;
    }

    public static List<Person> ex7() {
        List<Person> ageBetween=persons.stream()
                .filter(person -> person.getAge() > 18)
                .filter(person -> person.getAge() < 60)
                .collect(Collectors.toList());


        System.out.println("Age between 18-60: " + ageBetween);

        return ageBetween;
    }

    public static List<Person> ex8() {
        List<Person> firstA=persons.stream()
                .filter(person -> person.getFirstName().charAt(0) == 'A')
                .collect(Collectors.toList());


        System.out.println("First name starting with A: " + firstA);

        return firstA;
    }

    public static List<String> ex9() {
        List<String> uniquely=persons.stream()
                .map(person -> person.getFirstName())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Uniquely names: " + uniquely);

        return uniquely;
    }

    public static List<Person> ex10() {
        List<Person> sorting=persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());

        System.out.println("Sort by first name: " + sorting);

        return sorting;
    }

    public static List<Person> ex11() {
        List<Person> sorting=persons.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(Collectors.toList());

        System.out.println("Sort by last name " + sorting);

        return sorting;
    }

    public static List<Person> ex12() {
        List<Person> sorting=persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName)
                        .thenComparing(Person::getLastName)
                        .thenComparingInt(Person::getAge))
                .collect(Collectors.toList());

        System.out.println("Sort by first name,last name,age: " + sorting);

        return sorting;
    }

    public static void main(String[] args) {
        listPersons();

        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
        ex9();
        ex10();
        ex11();
        ex12();
    }


  public   static class Person {
        private final String firstName;
        private final String lastName;
        private final int    age;
        private       String city;

        public Person(String firstName, String lastName, int age, String city) {
            this.firstName=firstName;
            this.lastName=lastName;
            this.age=age;
            this.city=city;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person=(Person) o;
            return age == person.age && firstName.equals(person.firstName) && lastName.equals(person.lastName) && city.equals(person.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName, age, city);
        }

        @Override
        public String toString() {
            return "firstName " + firstName + '\'' +
                    ", lastName " + lastName + '\'' +
                    ", age " + age +
                    ", city " + city + '\''
                    ;
        }
    }

}
