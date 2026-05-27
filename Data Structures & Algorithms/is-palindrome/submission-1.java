class Solution {

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip invalid characters from left
            while (left < right &&
                   !Character.isLetterOrDigit(s.charAt(left))) {

                left++;
            }

            // Skip invalid characters from right
            while (left < right &&
                   !Character.isLetterOrDigit(s.charAt(right))) {

                right--;
            }

            // Convert left character to lowercase
            char leftChar =
                    Character.toLowerCase(s.charAt(left));

            // Convert right character to lowercase
            char rightChar =
                    Character.toLowerCase(s.charAt(right));

            // Compare characters
            if (leftChar != rightChar) {

                return false;
            }

            // Move pointers
            left++;
            right--;
        }

        return true;
    }
}