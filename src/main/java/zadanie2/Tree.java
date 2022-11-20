package zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    public List<Integer> list = new ArrayList<>();

    public void addValue(int x) {
        list.add(x);
    }

    public void findMaxValue() {
        int maxValue = list.get(0);
        for (int number : list) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        System.out.println(maxValue);
    }

    public void findMInValue() {
        int minValue = list.get(0);
        for (int number : list) {
            if (number < minValue) {
                minValue = number;
            }
        }
        System.out.println(minValue);
    }

    public void contain(int value) {
        for (int number : list) {
            if (number == value) {
                System.out.println("true");
            }
        }
        System.out.println("false");
    }
}
