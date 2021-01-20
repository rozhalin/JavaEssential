package EX4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays. asList(1, 2, 3, 4, 5, 6));

        ListIterator<Integer> listIterator = nums.listIterator();
        while (listIterator.hasNext()) {
            Integer i = listIterator.next();
            listIterator.set(i + 1);
        }

        for (Integer i : nums) {
            System.out.println(i);
        }
    }
}
