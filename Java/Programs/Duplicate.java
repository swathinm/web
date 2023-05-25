import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,2,3,4,4,5,6,7,7,8,9,9,9,0,0,0,0};
        Map<Integer, Integer> obj = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (!obj.containsKey(num)) {
                obj.put(num, 1);
            } else {
                obj.put(num, obj.get(num) + 1);
            }
        }
        for (int number : obj.keySet()) {
            System.out.println(number + " " + obj.get(number) + " times");
        }
    }
}
