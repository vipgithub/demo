import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Test {

    public static final String USERNAME = "lisi";

    public static void main(String[] args) {
        System.out.println("");

        List<String> list = new ArrayList<>();
    }

    //单行注释
    public void newmeth() {
        test2();

    }

    public void test2() {
        List<String> list2 = new ArrayList();
        list2.add("aa");
        list2.add("aa");
        list2.add("aa");
        int num = 10;
        System.out.println("num = " + num);
    }
}
