import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add("Sergey");
        list.add("Anna");

        System.out.println(list.get(0));
        System.out.println(list.size());

        System.out.println(list);

        list.remove(0);
        System.out.println(list.size());
        System.out.println(list);

        List<Integer> list1= new ArrayList<>();

    }
}
