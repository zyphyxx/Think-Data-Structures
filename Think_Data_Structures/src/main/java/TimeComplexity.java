public class TimeComplexity {

    public static int algorithmNumberOne (int n) {
        return n * (n + 1) / 2;
    }

    public static int algorithmNumberTwo (int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        double now = System.currentTimeMillis();

        System.out.println(TimeComplexity.algorithmNumberTwo(99999));

        // System.out.println(TimeComplexity.algorithmNumberOne(99999));

        System.out.println("Time taken - "+ (System.currentTimeMillis() - now) + " milisecs.");
    }
}
