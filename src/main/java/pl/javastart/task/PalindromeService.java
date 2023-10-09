package pl.javastart.task;

public class PalindromeService {

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        int halfOfArray = array.length / 2;

        for (int i = 0; i < halfOfArray; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }

        return true;
    }
}
