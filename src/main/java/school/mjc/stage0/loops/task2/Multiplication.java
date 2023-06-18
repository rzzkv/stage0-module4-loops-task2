package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int i = 0;
        while (i <= Math.abs(multiplyByAndToInclusive)) {
            int result = i * multiplyByAndToInclusive;
            System.out.println(result);
            i++;
        }
    }

    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        m.printMultiplied(-4);
    }
}
