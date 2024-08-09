public class GenericsExamples {
    public static void main(String[] args) {
        shout("John",7); //pass in the function in main class
    }

    private static <T,V> T shout (T thingtoShout, V otherthingtoShout) { //if you want a certain type
        System.out.println(thingtoShout + "!!!");
        System.out.println(otherthingtoShout + "!!!11");

        return thingtoShout;
    }
}