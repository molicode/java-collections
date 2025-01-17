package com.linkedin.utilities._01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application {

  public static void main(String[] args) {

    Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
    Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
    Room oxford = new Room("Oxford", "Suite", 5, 225.0);
    Room oxfordGuest = new Room("Oxford", "Guest Room", 5, 225.0);
    Room victoria = new Room("Victoria", "Suite", 5, 225.0);

    List<Room> rooms = new ArrayList<>(List.of(piccadilly, oxfordGuest, cambridge, victoria, oxford));

    rooms.sort(Comparator.naturalOrder());

    rooms.stream()
        .forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getRate()));

  }

}
