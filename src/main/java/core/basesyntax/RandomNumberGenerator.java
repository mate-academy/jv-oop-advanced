package core.basesyntax;

public class RandomNumberGenerator {
    public static final int MAX = 15;
    public static final int MIN = 1;
    public static final int NUMBER_OF_FIGURES = 5;

    public double getRandomProperty() {
        return (int) ((Math.random() * (MAX - MIN)) + MIN);
    }

    public int getRandomNumber() {
        return (int) (Math.random() * (NUMBER_OF_FIGURES - MIN)) + MIN;
    }
}
