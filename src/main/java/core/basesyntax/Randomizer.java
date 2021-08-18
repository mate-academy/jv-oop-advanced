package core.basesyntax;

public class Randomizer {
    public int getRandomNumber() {
        return (int) (1 + (Math.random() * ((5 - 1) + 1)));
    }
}
