package core.basesyntax;

public class Random {
    public int getRandomColorIndex() {
        return new java.util.Random().nextInt(Color.values().length);
    }

    public int getProperty() {
        return new java.util.Random().nextInt(20);
    }
}
