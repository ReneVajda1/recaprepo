package file.io.pokemon;

import java.nio.file.*;
import java.util.*;
import java.io.IOException;

public class PokemonApp {
    public static void main(String[] args) {
        // Replace the path with the correct file location
        List<String> pokemons = readfile("src/file.io/pokemons.csv");
        System.out.println(pokemons);
    }

    static List<String> readfile(String file) {
        Path filePath = Paths.get(file); // Define the file path
        try {
            List<String> fileLines = Files.readAllLines(filePath); // Read all lines
            fileLines.remove(0); // Remove header (optional)
            return fileLines;
        } catch (IOException e) {
            System.err.println("Unable to read the file: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
