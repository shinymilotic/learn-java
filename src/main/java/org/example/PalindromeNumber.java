package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class PalindromeNumber {

    // 9. Palindrome Number
    public boolean isPalindrome(int x) {
        Queue<Integer> queue = new LinkedList<>();
        int input = x;
        int builtNum = 0;

        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        while (x > 0) {
            queue.add(x%10);
            x /= 10;
        }

        while (!queue.isEmpty()) {
            builtNum *= 10;
            builtNum += queue.poll();
        }

        return builtNum == input;
    }


}
