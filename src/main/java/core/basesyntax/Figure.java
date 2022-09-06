package core.basesyntax;

import java.util.Random;

public abstract class Figure implements AreaCalculator, Drawable {
    private static final int MAX_SIZE = 25;
    private String color;
    private Random random = new Random();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRandom() {
        return random.nextInt(MAX_SIZE);
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
