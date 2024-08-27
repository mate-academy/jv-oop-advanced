package core.basesyntax;

import java.util.Random;

public abstract class Figure implements FigureInformation {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private String color = colorSupplier.getRandomColor();

    public abstract Figure createRandomFigure();

    protected int getRandomInt() {
        return random.nextInt(100);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
