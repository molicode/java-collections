package com.linkedin.queue_and_deque._02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GuestService {

  private List<Guest> checkInList = new ArrayList<>(100);

  public static List<Guest> filterByFavoriteRoom(List<Guest> guests, Room room) {

    return guests.stream()
        .filter(g -> g.getPreferredRooms().indexOf(room) == 0)
        .collect(Collectors.toList());

  }

  public void checkIn(Guest guest) {

    if (guest.isLoyaltyProgramMember() && !this.checkInList.isEmpty()) {

      int x = 0;
      for (; x < this.checkInList.size(); x++) {

        if (this.checkInList.get(x).isLoyaltyProgramMember()) {
          continue;
        }

        break;

      }

      this.checkInList.add(x, guest);

    } else {
      this.checkInList.add(guest);
    }

  }

  public void swapPosition(Guest guest1, Guest guest2) {
    int position1 = this.checkInList.indexOf(guest1);
    int position2 = this.checkInList.indexOf(guest2);

    if (position1 != -1 && position2 != -1) {

      this.checkInList.set(position1, guest2);
      this.checkInList.set(position2, guest1);

    }

  }

  public List<Guest> getCheckInList() {
    return List.copyOf(this.checkInList);
  }
}
