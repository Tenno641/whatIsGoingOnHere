package ThreadLocal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ThreadLocal<List<String>> threadLocal = ThreadLocal.withInitial(Main::initList);
        threadLocal.remove();
        threadLocal.remove();
        threadLocal.remove();
        System.out.println(threadLocal.get());

    }

    public static List<String> initList(){
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        return list;
    }


}
