import java.io.*;
import java.util.ArrayList;

public class FavouriteAnimals {
    public static void main(String[] args) {
        // The program's aim is to collect your favourite animals and store them in a text file.
        // There is a given text file called '''favourites.txt''', it will contain the animals
        // If ran from the command line without arguments
        // It should print out the usage:
        // ```java FavouriteAnimals [animal] [animal]```
        // You can add as many command line arguments as many favourite you have.
        // One animal should be stored only at once
        // Each animal should be written in separate lines
        // The program should only save animals, no need to print them

        if (args.length == 0) {
            usage();
        } else {
            storeAnimals(args);
        }
    }

    static void usage () {
            System.out.println("```java FavouriteAnimals [animal] [animal]```");
    }

    static void storeAnimals (String[] s) {
        for (int i = 0; i < s.length; i++) {
            if (!inIt(s[i])) {
                addAnimal(s[i]);
            }
        }
    }

    static boolean inIt (String animal) {
        boolean in = false;
        try (BufferedReader br = new BufferedReader(new FileReader("favourites.txt"))) {
            String line = br.readLine();
                while (line != null && line != "") {
                    if (line.contains(animal)) {
                        in = true;
                    }
                    line = br.readLine();
                }
        }catch (IOException e) {
            System.out.println("Can't find Tasks.txt.");
        }
        return in;
    }

    static void addAnimal (String animal) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("favourites.txt", true))) {
            bw.newLine();
            bw.write(animal);
        }catch (IOException e) {
            System.out.println("Can't find the txt file");
        }
    }

}