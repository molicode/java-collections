package com.linkedin.collections._10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Application {

  public static void main(String[] args) {

    Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
    Room manchester = new Room("Manchester", "Suite", 5, 250.00);
    Room oxford = new Room("Oxford", "Suite", 5, 225.0);
    Room victoria = new Room("Victoria", "Suite", 5, 225.00);

    Collection<Room> rooms = new ArrayList<>(Arrays.asList(cambridge, oxford, victoria, manchester));
    oxford.setPetFriendly(true);
    victoria.setPetFriendly(true);

    rooms.stream()
        .filter(Room::isPetFriendly)
        .forEach(room -> System.out.println("[foreach|Consumer]: " + room.getName()));
  }
}









