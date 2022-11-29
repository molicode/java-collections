package com.linkedin.map._01;

import java.util.HashMap;
import java.util.Map;

public class Application {

  public static void main(String[] args) {

    Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
    Room oxford = new Room("Oxford", "Suite", 5, 225.0);

    Guest john = new Guest("John", "Doe", false);
    Guest maria = new Guest("Maria", "Doe", true);

    Map<Room, Guest> assignments = new HashMap<>();
    assignments.put(oxford, maria);
    assignments.put(piccadilly, john);

    // exactamente la misma instancia de objeto
    System.out.println("Oxford: " + assignments.get(new Room("Oxford", "Suite", 5, 225.0)));

    //instancia de objeto logicamente equivalente
    System.out.println("Piccadilly: " + assignments.get(piccadilly));

    Guest guest = assignments.put(piccadilly, assignments.remove(oxford));
    assignments.putIfAbsent(oxford, guest);
    System.out.println();

    // exactamente la misma instancia de objeto
    System.out.println("Oxford: " + assignments.get(new Room("Oxford", "Suite", 5, 225.0)));

    //instancia de objeto logicamente equivalente
    System.out.println("Piccadilly: " + assignments.get(piccadilly));

  }

}
