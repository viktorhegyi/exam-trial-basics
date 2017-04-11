package countAs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * Created by hegyi on 2017-04-11.
 */
public class CountAs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int counter = 0;
    System.out.println("Write in the file name: ");
    String input = scanner.next();
    char a = 'a';
    Path path = Paths.get("countAs/" + input);

    try {
      List<String> text = Files.readAllLines(path);

      for (String words : text) {
        String sentence = words.toLowerCase();
        for (int i = 0; i < sentence.length() ; i++) {
          if (sentence.charAt(i) == a) {
            counter++;
          }
        }
        System.out.println(counter);
      }
    } catch (IOException e) {
      System.out.println("0");
    }
  }
}
