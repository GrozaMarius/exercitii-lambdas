package fasstrackit.curs17homework;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ExercitiiLambdas {
    List<Person> persons=List.of(
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


    public List<String> ex1() {
        List<String> names=persons.stream()
                .map(Person::getFullName)
                .collect(Collectors.toList());

        return names;
    }

    public List<Person> ex2() {
        List<Person> major=persons.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());

        return major;
    }

    public List<Person> ex3() {
        List<Person> fromOradea=persons.stream()
                .filter(person -> person.getCity().equals("Oradea"))
                .collect(Collectors.toList());

        return fromOradea;
    }

    public List<Person> ex4() {
        List<Person> fromOradeaorCluj=persons.stream()
                .filter(person -> person.getCity().equals("Oradea") || person.getCity().equals("Cluj"))
                .collect(Collectors.toList());

        return fromOradeaorCluj;
    }

    public List<String> ex5() {
        List<String> capitalized=persons.stream()
                .map(Person::getFirstName)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        return capitalized;
    }

    public List<String> ex6() {
        List<String> firstNamefirstLetter=persons.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName().charAt(0) + ".")
                .collect(Collectors.toList());

        return firstNamefirstLetter;
    }

    public List<Person> ex7() {
        List<Person> ageBetween=persons.stream()
                .filter(person -> person.getAge() > 18)
                .filter(person -> person.getAge() < 60)
                .collect(Collectors.toList());

        return ageBetween;
    }

    public List<Person> ex8() {
        List<Person> firstA=persons.stream()
                .filter(person -> person.getFirstName().charAt(0) == 'A')
                .collect(Collectors.toList());

        return firstA;
    }

    public List<String> ex9() {
        List<String> uniquely=persons.stream()
                .map(Person::getFirstName)
                .distinct()
                .collect(Collectors.toList());

        return uniquely;
    }

    public List<Person> ex10() {
        List<Person> sorting=persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());

        return sorting;
    }

    public List<Person> ex11() {
        List<Person> sorting=persons.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(Collectors.toList());

        return sorting;
    }

    public List<Person> ex12() {
        List<Person> sorting=persons.stream()
                .sorted(Comparator.comparing(Person::getFirstName)
                        .thenComparing(Person::getLastName)
                        .thenComparingInt(Person::getAge))
                .collect(Collectors.toList());

        return sorting;
    }


    static class Person {
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