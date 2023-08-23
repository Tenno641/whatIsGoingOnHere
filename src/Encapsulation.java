public class Encapsulation {

    public static void main(String[] a) {
        System.out.println(Pizza.PizzaSalesCounter.deliveredCount);
    }

}

class Pizza {

    private static String cookedCount;
    private boolean isThinCrust;

    public static class PizzaSalesCounter {

        private static String orderedCount;
        public static String deliveredCount;

        PizzaSalesCounter() {
            System.out.println("Static field of enclosing class is "
                    + Pizza.cookedCount);
            System.out.println("Non-static field of enclosing class is "
                    + new Pizza().isThinCrust);
        }
    }

    Pizza() {
        System.out.println("Non private static field of static class is "
                + Pizza.PizzaSalesCounter.deliveredCount);
        System.out.println("Private static field of static class is "
                + Pizza.PizzaSalesCounter.orderedCount);
    }

}

