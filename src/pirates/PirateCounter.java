package pirates;

import java.util.ArrayList;

/**
 * Created by hegyi on 2017-04-11.
 */
public class PirateCounter {

  static class Pirate {
    String name;
    boolean hasWoodenLeg;
    int gold;

    Pirate(String name, boolean hasWoodenLeg, int gold) {
      this.name = name;
      this.hasWoodenLeg = hasWoodenLeg;
      this.gold = gold;
    }
  }

  public static void main(String... args){
    ArrayList<Pirate> pirates = new ArrayList<>();

    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));

    System.out.println(woodenLegAndRich(pirates));
  }

  public static ArrayList<String> woodenLegAndRich(ArrayList<Pirate > list) {
    ArrayList<String> changedList = new ArrayList<>();

    for (Pirate pirate : list) {
      if (pirate.hasWoodenLeg == true && pirate.gold > 15) {
        String nameOfPirate;
        nameOfPirate = pirate.name;
        changedList.add(nameOfPirate);
      }
    }
    return changedList;
  }

}

