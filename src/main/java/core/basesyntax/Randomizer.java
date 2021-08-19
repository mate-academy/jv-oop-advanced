package core.basesyntax;

public class Randomizer {
    static final int MIN = 1;
    static final int MAX = 5;

    public int getRandomNumber(int min, int max) {
        return (int) (min + (Math.random() * max));
    }
}
