import stdlib.StdIn;
import java.util.ArrayList;

public class ArmenianDictionary {
    private int wordsFound;
    private final ArrayList<String> words;

    public ArmenianDictionary() {
        wordsFound = 0;
        words = new ArrayList<>();

        while (!StdIn.isEmpty()) {
            words.add(StdIn.readLine());
        }
    }

    public void getResponse(String input) {
        input = input.trim();
        if (input.length() == 0) {
            System.out.println("\nPlease specify what you would like to search\n");
        }
        else if (input.equals("# of words")) {
            wordCount();
        }
        else if (!(input.endsWith("-")) && input.charAt(0) != '-'){
            System.out.println("\nMake sure you use \"-\" before or after your search.");
        }

        else if (input.charAt(0) == '-') {
            endSearch(input);
        }
        else if (input.endsWith("-")) {
            forwardSearch(input);
        }
    }

    private void forwardSearch(String searchTerm) {
        wordsFound = 0;

        for (String term : words) {
            if (searchTerm.length()-1 < term.length() && term.substring(0,
                    searchTerm.length()-1).equals(searchTerm.substring(0, searchTerm.length()-1))) {
                System.out.println(term);
                wordsFound++;
            }
        }

        if (wordsFound == 0) {
            System.out.println("\nEither there are no words in this program that match your " +
                    "search case or the program made a mistake. Please try again.");
        }
    }

    private void endSearch(String searchTerm) {
        wordsFound = 0;

        for (String term : words) {
            if (searchTerm.length()-1 < term.length() && term.substring(term.length() - (searchTerm.length()-1)).equals(searchTerm.substring(1))) {
                System.out.println(term);
                wordsFound++;
            }
        }

        if (wordsFound == 0) {
            System.out.println("\nEither there are no words in this program that match your " +
                    "search case or the program made a mistake. Please try again.");
        }
    }

    private void wordCount() {
        System.out.println("\nThis program currently has " + (words.size()) + " Armenian words.");
    }
}
