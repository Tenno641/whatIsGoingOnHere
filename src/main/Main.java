package main;

public class Main {

    public static void main(String[] args) {

        Test test = new Test(Integer.parseInt(args[0]));

        if(Test.products.EVEN.getState()) {
            System.out.println(Test.num + " is even");
        } else {
            System.out.println(Test.num + " is odd");
        }

        System.out.println(test.state());

    }

}

class Test {

    public static int num;

    Test(int num) {
        Test.num = num;
    }

    enum products {
        EVEN,
        ODD;

        private boolean isEven() {
            return num % 2 == 0;
        }

        private boolean isOdd() {
            return num % 2 == 1;
        }

        public boolean getState() {
            if (this == EVEN) {
                return isEven();
            } else if (this == ODD){
                return isOdd();
            }
            return false;
        }

    }

    public String state() {
        if (products.EVEN.getState()) {
            return "even";
        } else if (products.ODD.getState()) {
            return "odd";
        }
        return null;
    }

}
