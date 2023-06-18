package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        int factorial = 1;
        while (i <= printToInclusive) {
            System.out.println(factorial);
            i++;
            factorial *= i;
        }
    }

    public static void main(String[] args) {
        FactorialNumbers fn = new FactorialNumbers();
        fn.printFactorialRow(10);
    }
}
