package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
            return;
        }
        int currentPower = 0;
        int result = 1;
        while (currentPower <= power) {
            System.out.println(result);
            result *= 2;
            currentPower++;
        }
    }
}
