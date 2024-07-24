import java.util.Scanner;
 public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence = sc.nextLine();
        String reversedSentence = reverseEachWord(sentence);
        System.out.println(reversedSentence);
    }

    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            reversed.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        // Remove the extra space at the end
        return reversed.toString().trim();
    }
}
