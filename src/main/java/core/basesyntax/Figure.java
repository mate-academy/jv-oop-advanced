package core.basesyntax;

import java.util.Random;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int side() {
        final int minLength = 1;
        final int maxLength = 10;
        return new Random().nextInt(minLength, maxLength);
    }

    public String getRandomColor() {
        return new ColorSupplier().getRandomColor();
    }
}
