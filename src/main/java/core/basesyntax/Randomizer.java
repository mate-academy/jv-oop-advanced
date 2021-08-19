package core.basesyntax;

public class Randomizer {

    public int getRandomNumber(int min, int max) {
        return (int) (min + (Math.random() * max));
    }
}
