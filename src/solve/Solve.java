package solve;

import main.Main;

public class Solve {

    public static void main(String[] args) {

        System.out.println(utility.number);

        utility utility = new utility();

        utility.inc();
        utility.inc();
        utility.inc();
        utility.inc();
        System.out.println(utility.get());

    }

}

class utility {

    static int number = 2;

    void inc() {
        number++;
    }

    int get() {
        return number;
    }


}
