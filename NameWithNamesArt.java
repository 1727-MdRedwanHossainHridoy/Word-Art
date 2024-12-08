import java.util.*;

public class NameWithNamesArt {
    public static void main(String[] args) {
        // List of names provided
        List<String> names = Arrays.asList(
                "Fahim", "Srabon", "Rahat", "Faishal", "Rakib", "Shohan", "Marjan", "Santa",
                "NIROB", "HUSAIN", "REZAUL", "ARIFUL", "ALIM", "EMON", "Mariam", "Farhan",
                "Sabir", "Sarifa", "LABIB", "Masum", "Mohaymenul", "NOYON", "RAMJAN", "Alvhi",
                "JIHADUL", "DIPTO", "SABIT", "TITHI", "Kongkona", "Nafisa", "Tonni", "Nahida",
                "NISHA", "MARIA", "Zitu", "Mawa", "Fahim", "Neamat", "Shakhawat", "Hridoy",
                "Nayeemul", "Vaskar", "Prottoy", "Jobaer", "Fairuj", "Dipjay", "Monir", "Ananya", "Ridi"
        );

        // Word to be sketched
        String targetWord = "Hridoy";

        // Generate and print the art
        printWordArt(targetWord, names);
    }

    /**
     * Prints a word using ASCII art, replacing '*' with provided names.
     */
    public static void printWordArt(String word, List<String> names) {
        // Map for ASCII representation of letters
        Map<Character, String[]> asciiMap = createAsciiMap();
        Random random = new Random();

        // Height of ASCII letters
        int asciiHeight = 7;

        // Additional spacing between constructed letters
        int extraSpacing = 10;

        // Iterate over each row of ASCII art
        for (int row = 0; row < asciiHeight; row++) {
            for (char ch : word.toUpperCase().toCharArray()) {
                String[] asciiChar = asciiMap.getOrDefault(ch, asciiMap.get(' '));
                if (asciiChar != null && row < asciiChar.length) {
                    // Replace '*' with random names, and keep spaces
                    for (char c : asciiChar[row].toCharArray()) {
                        if (c == '*') {
                            System.out.printf("%-8s", names.get(random.nextInt(names.size()))); // 8-character width
                        } else {
                            System.out.print("        "); // Blank space
                        }
                    }
                }
                // Add extra spacing between letters
                System.out.print(" ".repeat(extraSpacing));
            }
            System.out.println(); // Newline after each row
        }
    }

    /**
     * Creates a map of ASCII art for each character.
     */
    public static Map<Character, String[]> createAsciiMap() {
        Map<Character, String[]> asciiMap = new HashMap<>();

        asciiMap.put('H', new String[]{
                "*     *", "*     *", "*     *", "*******", "*     *", "*     *", "*     *"
        });
        asciiMap.put('R', new String[]{
                "****** ", "*     *", "*     *", "****** ", "*  *   ", "*   *  ", "*    * "
        });
        asciiMap.put('I', new String[]{
                "*******", "   *   ", "   *   ", "   *   ", "   *   ", "   *   ", "*******"
        });
        asciiMap.put('D', new String[]{
                "****** ", "*     *", "*     *", "*     *", "*     *", "*     *", "****** "
        });
        asciiMap.put('O', new String[]{
                "*******", "*     *", "*     *", "*     *", "*     *", "*     *", "*******"
        });
        asciiMap.put('Y', new String[]{
                "*     *", " *   * ", "  * *  ", "   *   ", "   *   ", "   *   ", "   *   "
        });
        asciiMap.put(' ', new String[]{
                "       ", "       ", "       ", "       ", "       ", "       ", "       "
        });

        return asciiMap;
    }
}
