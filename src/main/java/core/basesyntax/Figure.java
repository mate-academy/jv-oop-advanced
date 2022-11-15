package core.basesyntax;

import java.util.Random;

public class Figure implements InfoPrinter, AreaCalculator, FigureCreator {
    private final int maxSize = 15;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private String color;

    public ColorSupplier getColorSupplier() {
        return colorSupplier;
    }

    public Random getRandom() {
        return random;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String draw() {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public Figure create() {
        return null;
    }
}
