package main.java.com.linkedin.collections._04;

import java.util.ArrayList;
import java.util.Collection;

import main.java.com.linkedin.collections._01.Room;

public class Application {

  public static void main(String[] args) {

    Collection<Room> c = new ArrayList(); //Same Collection Type, Different Element Type
    c.add(new Room("Cambridge", "Suite", 6, 250.0));

    c.stream()
        .forEach(e -> System.out.println(e.getName()));

    Collection c2 = new ArrayList(); //Same Collection Type, Different Element Type
    c2.add(new Room("Cambridge", "Suite", 6, 250.0));

  }

}
