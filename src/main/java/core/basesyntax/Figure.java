package core.basesyntax;

import java.util.Random;

public abstract class Figure implements AreaCalculator, Drawable {
    private static final int MAX_SIZE = 25;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private Random random = new Random();

    public int getRandom() {
        return random.nextInt(MAX_SIZE);
    }

    public void setRandom(Random random) {
        this.random = random;
    }
    public Figure getRandomCircle() {
        return new Circle(getRandom());
    }


}
