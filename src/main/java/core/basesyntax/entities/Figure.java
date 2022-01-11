package core.basesyntax.entities;

import core.basesyntax.interfaces.Drawable;
import core.basesyntax.service.ColorSupplier;
import java.util.Random;

public abstract class Figure implements Drawable {
    public static final Integer BOUND = 100;
    public static final Double DOUBLE_BOUND = 360.0;
    public static final Integer COEFFICIENT_TWO = 2;
    public String color;
    public Random random;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public Figure setRandomProperties(ColorSupplier colorSupplier) {
        this.color = colorSupplier.getRandomColor();
        return this;
    }
}
