import java.util.*;

public class NameWithNamesArt {
    public static void main(String[] args) {
       
        List<String> names = Arrays.asList(
                "Fahim", "Srabon", "Rahat", "Faishal", "Rakib", "Shohan", "Marjan", "Santa",
                "NIROB", "HUSAIN", "REZAUL", "ARIFUL", "ALIM", "EMON", "Mariam", "Farhan",
                "Sabir", "Sarifa", "LABIB", "Masum", "Mohaymenul", "NOYON", "RAMJAN", "Alvhi",
                "JIHADUL", "DIPTO", "SABIT", "TITHI", "Kongkona", "Nafisa", "Tonni", "Nahida",
                "NISHA", "MARIA", "Zitu", "Mawa", "Fahim", "Neamat", "Shakhawat", "Hridoy",
                "Nayeemul", "Vaskar", "Prottoy", "Jobaer", "Fairuj", "Dipjay", "Monir", "Ananya", "Ridi"
        );

       
        String targetWord = "Hridoy";

     
        printWordArt(targetWord, names);
    }

   
    public static void printWordArt(String word, List<String> names) {
   
        Map<Character, String[]> asciiMap = createAsciiMap();
        Random random = new Random();

  
        int asciiHeight = 7;
        int extraSpacing = 10;

        for (int row = 0; row < asciiHeight; row++) {
            for (char ch : word.toUpperCase().toCharArray()) {
                String[] asciiChar = asciiMap.getOrDefault(ch, asciiMap.get(' '));
                if (asciiChar != null && row < asciiChar.length) {
                    // Replace '*' with random names, and keep spaces
                    for (char c : asciiChar[row].toCharArray()) {
                        if (c == '*') {
                            System.out.printf("%-8s", names.get(random.nextInt(names.size())));
                        } else {
                            System.out.print("        ");
                        }
                    }
                }
                // Add extra spacing between letters
                System.out.print(" ".repeat(extraSpacing));
            }
            System.out.println();
        }
    }

   
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
