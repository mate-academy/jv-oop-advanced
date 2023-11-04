package core.basesyntax;

import java.util.Random;

public abstract class Figure implements AreaCalculator, Drawable, FigureLogic {
    private String color;
    private final Random random = new Random();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int side() {
        final int minLength = 1;
        final int maxLength = 10;
        return random.nextInt(minLength, maxLength);
    }

    @Override
    public String color() {
        return new ColorSupplier().getRandomColor();
    }
}
