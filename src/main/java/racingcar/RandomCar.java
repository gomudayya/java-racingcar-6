package racingcar;

import racingcar.util.RandomNumberGenerator;
import racingcar.util.ZeroToNineGenerator;

public class RandomCar {
    private String name;
    private int position = 0;
    private RandomNumberGenerator randomNumberGenerator;

    public RandomCar(String name) {
        this(name, new ZeroToNineGenerator());
    }

    public RandomCar(String name, RandomNumberGenerator randomGenerator) {
        this.name = name;
        this.randomNumberGenerator = randomGenerator;
    }

    public int move() {
        if (randomNumberGenerator.generate() >= 4) {
            position++;
        }

        return position;
    }

    public int move(int attemptCouunt) {
        for (int i = 0; i < attemptCouunt; i++) {
            if (randomNumberGenerator.generate() >= 4) {
                position++;
            }
        }

        return position;
    }

    public void printPosition() {
        String format = String.format("%5s : ", name);
        for (int i = 0; i < position; i++) {
            format += "-";
        }

        System.out.println(format);
    }
}