public class Encapsulation {

    private static String cookedCount;
    private boolean isThinCrust;

    public static class PizzaSalesCounter {

        private static String orderedCount;
        public static String deliveredCount;

        PizzaSalesCounter() {
            System.out.println("Static field of enclosing class is "
                    + Encapsulation.cookedCount);
            System.out.println("Non-static field of enclosing class is "
                    + new Encapsulation().isThinCrust);
        }
    }

    Encapsulation() {
        System.out.println("Non private static field of static class is "
                + Encapsulation.PizzaSalesCounter.deliveredCount);
        System.out.println("Private static field of static class is "
                + Encapsulation.PizzaSalesCounter.orderedCount);
    }

    public static void main(String[] a) {
        System.out.println(PizzaSalesCounter.deliveredCount);
    }

}

