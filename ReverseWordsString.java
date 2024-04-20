import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ReverseWordsString {
    public String reverseWords(String s) {
        int start = 0;
        int end = s.length() - 1;
        StringBuilder result = new StringBuilder();
        Stack<Character> queue = new Stack<>();

        while (s.charAt(start) == ' ' || s.charAt(end) == ' ') {
            if (s.charAt(start) == ' ') {
                start++;
            }

            if(s.charAt(end) == ' ') {
                end--;
            }
        }
        
        Character previous = Character.MIN_VALUE;
        for (int i = end; i >= start; i--) {
            if (s.charAt(i) != ' ') {
                queue.push(s.charAt(i));
            }

            if (s.charAt(i) == ' ' && ' ' != previous) {
                while (!queue.isEmpty()) {
                    Character chara = queue.pop();
                    result.append(chara);
                }
                result.append(' ');
            }

            if (i == start) {
                while (!queue.isEmpty()) {
                    Character chara = queue.pop();
                    result.append(chara);
                }
            }

            previous = s.charAt(i);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ReverseWordsString algo = new ReverseWordsString();
        algo.reverseWords("  hello world  ");
        // => dlrow  -> world
    }
}
