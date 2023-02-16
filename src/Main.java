import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();
        numbers.add(120);
        numbers.add("Safranbolu");
        numbers.add(213);
        System.out.println(numbers);
        System.out.println(numbers.size() + " elemanlı ArrayList");


        System.out.println("---------------");

        numbers.remove(0);
        System.out.println(numbers);

        System.out.println("---------------");

        numbers.set(0,"Karabük");
        System.out.println(numbers);

        System.out.println("---------------");

        System.out.println(numbers.get(0));

        System.out.println("---------------");

        numbers.clear();
        System.out.println(numbers);
    }
}