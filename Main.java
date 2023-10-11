import java.util.*;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        ArrayList<Integer> list = new ArrayList<>(500000);

        /*for (int i = 0; i < 500000; i++) {
            list.add(i);
        }*/

        System.out.println(System.currentTimeMillis() - startTime);
        list.clear();

        System.out.println("----------------------");

        long startTime1 = System.currentTimeMillis();

        LinkedList<Integer> list1 = new LinkedList<>();

        for (int i = 0; i < 500000; i++) {
            list1.add(i);
        }
        System.out.println(System.currentTimeMillis() - startTime1);
        list1.clear();
    }
}
