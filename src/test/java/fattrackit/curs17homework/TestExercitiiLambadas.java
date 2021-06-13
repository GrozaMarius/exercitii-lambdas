package fattrackit.curs17homework;

import fasstrackit.curs17homework.ExercitiiLambdas;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestExercitiiLambadas {


    @Test
    @DisplayName("Print FULL names TEST")
    void ex1() {
        ExercitiiLambdas.listPersons();
        List<String> result=ExercitiiLambdas.ex1();
        List<String> expected=List.of(
                "Ciurescu Ana", "Blodor Mihai", "Petrica George",
                "Petrut Laurentiu", "Pusca Ecaterina", "Puscas Darius",
                "Puscas Darius", "Puscas Arius", "Anton Crina");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Print major persons TEST")
    void ex2() {
        ExercitiiLambdas.listPersons();
        List<ExercitiiLambdas.Person> result=ExercitiiLambdas.ex2();
        List<ExercitiiLambdas.Person> expected=List.of(
                new ExercitiiLambdas.Person("Ciurescu", "Ana", 32, "Braila"),
                new ExercitiiLambdas.Person("Blodor", "Mihai", 22, "Oradea"),
                new ExercitiiLambdas.Person("Petrut", "Laurentiu", 52, "Cluj"),
                new ExercitiiLambdas.Person("Pusca", "Ecaterina", 32, "Cluj"),
                new ExercitiiLambdas.Person("Puscas", "Darius", 26, "Oradea"),
                new ExercitiiLambdas.Person("Puscas", "Darius", 64, "Oradea"),
                new ExercitiiLambdas.Person("Puscas", "Arius", 29, "Oradea"),
                new ExercitiiLambdas.Person("Anton", "Crina", 33, "Oradea"));
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Print persons from ORADEA Test")
    void ex3() {
        ExercitiiLambdas.listPersons();
        List<ExercitiiLambdas.Person> result=ExercitiiLambdas.ex3();
        List<ExercitiiLambdas.Person> expected=List.of(
                new ExercitiiLambdas.Person("Blodor", "Mihai", 22, "Oradea"),
                new ExercitiiLambdas.Person("Petrica", "George", 12, "Oradea"),
                new ExercitiiLambdas.Person("Puscas", "Darius", 26, "Oradea"),
                new ExercitiiLambdas.Person("Puscas", "Darius", 64, "Oradea"),
                new ExercitiiLambdas.Person("Puscas", "Arius", 29, "Oradea"),
                new ExercitiiLambdas.Person("Anton", "Crina", 33, "Oradea"));
        assertThat(result).isEqualTo(expected);

    }

    @Test
    @DisplayName("Print persons ORADEA OR CLUJ TEST")
    void ex4() {
        ExercitiiLambdas.listPersons();
        List<ExercitiiLambdas.Person> result=ExercitiiLambdas.ex4();
        List<ExercitiiLambdas.Person> expected=List.of(
                new ExercitiiLambdas.Person("Blodor", "Mihai", 22, "Oradea"),
                new ExercitiiLambdas.Person("Petrica", "George", 12, "Oradea"),
                new ExercitiiLambdas.Person("Petrut", "Laurentiu", 52, "Cluj"),
                new ExercitiiLambdas.Person("Pusca", "Ecaterina", 32, "Cluj"),
                new ExercitiiLambdas.Person("Puscas", "Darius", 26, "Oradea"),
                new ExercitiiLambdas.Person("Puscas", "Darius", 64, "Oradea"),
                new ExercitiiLambdas.Person("Puscas", "Arius", 29, "Oradea"),
                new ExercitiiLambdas.Person("Anton", "Crina", 33, "Oradea"));
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Print firstName to uppercase TEST")
    void ex5() {
        ExercitiiLambdas.listPersons();
        List<String> result=ExercitiiLambdas.ex5();
        List<String> expected=List.of(
                "CIURESCU", "BLODOR", "PETRICA", "PETRUT", "PUSCA", "PUSCAS",
                "PUSCAS", "PUSCAS", "ANTON");
        assertThat(result).isEqualTo(expected);
    }


    @Test
    @DisplayName("Print firstName and secondName only firstLetter TEST")
    void ex6() {
        ExercitiiLambdas.listPersons();
        List<String> result=ExercitiiLambdas.ex6();
        List<String> expected=List.of(
                "Ciurescu A.", "Blodor M.", "Petrica G.", "Petrut L.",
                "Pusca E.", "Puscas D.", "Puscas D.", "Puscas A.", "Anton C.");
        assertThat(result).isEqualTo(expected);
    }


    @Test
    @DisplayName("Print AGE between 18-60 TEST")
    void ex7() {
        ExercitiiLambdas.listPersons();

        List<ExercitiiLambdas.Person> result=ExercitiiLambdas.ex7();
        List<ExercitiiLambdas.Person> expected=List.of(
                new ExercitiiLambdas.Person("Ciurescu", "Ana", 32, "Braila"),
                new ExercitiiLambdas.Person("Blodor", "Mihai", 22, "Oradea"),
                new ExercitiiLambdas.Person("Petrut", "Laurentiu", 52, "Cluj"),
                new ExercitiiLambdas.Person("Pusca", "Ecaterina", 32, "Cluj"),
                new ExercitiiLambdas.Person("Puscas", "Darius", 26, "Oradea"),
                new ExercitiiLambdas.Person("Puscas", "Arius", 29, "Oradea"),
                new ExercitiiLambdas.Person("Anton", "Crina", 33, "Oradea")
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Prrint first NAME starting with A TEST")
    void ex8() {
        ExercitiiLambdas.listPersons();
        List<ExercitiiLambdas.Person> result=ExercitiiLambdas.ex8();
        List<ExercitiiLambdas.Person> expected=List.of(
                new ExercitiiLambdas.Person("Anton", "Crina", 33, "Oradea")
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("Print UNIQUELY names TEST")
    void ex9() {
        ExercitiiLambdas.listPersons();
        List<String> result=ExercitiiLambdas.ex9();
        List<String> expected=List.of(
                "Ciurescu", "Blodor", "Petrica", "Petrut", "Pusca", "Puscas", "Anton"
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("SORT by firstName TEST")
    void ex10() {
        ExercitiiLambdas.listPersons();
        List<ExercitiiLambdas.Person> result=ExercitiiLambdas.ex10();
        List<ExercitiiLambdas.Person> expected=List.of(
                new ExercitiiLambdas.Person("Anton", "Crina", 33, "Oradea"),
                new ExercitiiLambdas.Person("Blodor", "Mihai", 22, "Oradea"),
                new ExercitiiLambdas.Person("Ciurescu", "Ana", 32, "Braila"),
                new ExercitiiLambdas.Person("Petrica", "George", 12, "Oradea"),
                new ExercitiiLambdas.Person("Petrut", "Laurentiu", 52, "Cluj"),
                new ExercitiiLambdas.Person("Pusca", "Ecaterina", 32, "Cluj"),
                new ExercitiiLambdas.Person("Puscas", "Darius", 26, "Oradea"),
                new ExercitiiLambdas.Person("Puscas", "Darius", 64, "Oradea"),
                new ExercitiiLambdas.Person("Puscas", "Arius", 29, "Oradea")

        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("SORT by lastName TEST")
    void ex11() {
        ExercitiiLambdas.listPersons();
        List<ExercitiiLambdas.Person> result=ExercitiiLambdas.ex11();
        List<ExercitiiLambdas.Person> expected=List.of(
                new ExercitiiLambdas.Person("Ciurescu", "Ana", 32, "Braila"),
                new ExercitiiLambdas.Person("Puscas", "Arius", 29, "Oradea"),
                new ExercitiiLambdas.Person("Anton", "Crina", 33, "Oradea"),
                new ExercitiiLambdas.Person("Puscas", "Darius", 26, "Oradea"),
                new ExercitiiLambdas.Person("Puscas", "Darius", 64, "Oradea"),
                new ExercitiiLambdas.Person("Pusca", "Ecaterina", 32, "Cluj"),
                new ExercitiiLambdas.Person("Petrica", "George", 12, "Oradea"),
                new ExercitiiLambdas.Person("Petrut", "Laurentiu", 52, "Cluj"),
                new ExercitiiLambdas.Person("Blodor", "Mihai", 22, "Oradea")
        );
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("SORT by firstName,lastName,age TEST")
    void ex12() {
        ExercitiiLambdas.listPersons();
        List<ExercitiiLambdas.Person> result=ExercitiiLambdas.ex12();
        List<ExercitiiLambdas.Person> expected=List.of(
                new ExercitiiLambdas.Person("Anton", "Crina", 33, "Oradea"),
                new ExercitiiLambdas.Person("Blodor", "Mihai", 22, "Oradea"),
                new ExercitiiLambdas.Person("Ciurescu", "Ana", 32, "Braila"),
                new ExercitiiLambdas.Person("Petrica", "George", 12, "Oradea"),
                new ExercitiiLambdas.Person("Petrut", "Laurentiu", 52, "Cluj"),
                new ExercitiiLambdas.Person("Pusca", "Ecaterina", 32, "Cluj"),
                new ExercitiiLambdas.Person("Puscas", "Arius", 29, "Oradea"),
                new ExercitiiLambdas.Person("Puscas", "Darius", 26, "Oradea"),
                new ExercitiiLambdas.Person("Puscas", "Darius", 64, "Oradea")
                );
        assertThat(result).isEqualTo(expected);

    }
}