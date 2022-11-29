package com.linkedin.set.treeset;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Application {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(500, 1500, 2500, 1000, 3000, 2000);

    NavigableSet<Integer> numberTree = new TreeSet<>(numbers);

    System.out.println("\nnormal: ");
    numberTree.stream()
        .forEach(System.out::println);

    System.out.println("\ndescendingSet: ");
    numberTree.descendingSet()
        .stream()
        .forEach(System.out::println);

    System.out.println("\nheadSet: ");
    numberTree.headSet(1750)
        .stream()
        .forEach(System.out::println);

    System.out.println("\ntailSet: ");
    numberTree.tailSet(1750)
        .stream()
        .forEach(System.out::println);

    System.out.println("\nsubSet: ");
    numberTree.subSet(1750, 2750)
        .stream()
        .forEach(System.out::println);

    System.out.println("\nhigher: ");
    System.out.println(numberTree.higher(750));

  }
}
