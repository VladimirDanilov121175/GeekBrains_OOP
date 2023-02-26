package lesson4.Ex002_ParametricMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<String> words = new ArrayList<>(List.of("word1", "word2", "word3", "word4"));

//        System.out.println(Methods.getElementFromIntegerCollection(nums, 2));   // 3
        System.out.println(Methods.getElementFromUCollection(nums, 2)); // 3

//        System.out.println(Methods.getElementFromStringCollection(words, 2)); // word3
        System.out.println(Methods.getElementFromUCollection(words, 2)); // word3

        // region MultiParametrized
        System.out.println(Methods.putIntoMap(nums.get(2), words.get(2)));  // word3
        System.out.println(Methods.putIntoMap(words.get(2), nums.get(2)));  // 3
        // endregion MultiParametrized
    }
}
