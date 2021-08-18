package core.basesyntax;

import java.util.Random;

public abstract class Figure implements AreaCalculator, InfoPrinter {
    private Random random = new Random();
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor() {
        ColorSupplier supplier = new ColorSupplier();
        this.color = supplier.getRandomColor();
    }

    public Random getRandom() {
        return random;
    }

    public abstract Double getArea();

    public abstract void draw();
}
