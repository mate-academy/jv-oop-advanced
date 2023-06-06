package core.basesyntax;

import java.util.Random;

public abstract class Figure implements Drawable, AreaCalculator {
    public static final ColorSupplier colorSupplier = new ColorSupplier();
    public static final int NUMBER = 10;
    public static final Random random = new Random();
    private double area;
    private String color;

    @Override
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
