package seconds;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by hegyi on 2017-04-11.
 */
public class Seconds {

  public static ArrayList everySecond(ArrayList<Integer> array ) {
    ArrayList<Integer> listChanged = new ArrayList<>();
    for (int i = 1; i < array.size(); i = i + 2) {
      listChanged.add(array.get(i));
    }
    return listChanged;
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    System.out.println(everySecond(list));
  }

}