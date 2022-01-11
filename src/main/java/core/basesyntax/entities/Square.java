package core.basesyntax.entities;

import core.basesyntax.service.ColorSupplier;
import java.util.Random;

public class Square extends Figure {
    private static final int NUMBER_OF_SIDES = 4;
    private Integer side;

    public Square() {
    }

    public Square(Random random) {
        this.random = random;
    }

    public Square(Random random, Integer side, String color) {
        this.random = random;
        this.side = side;
        this.color = color;
    }

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getPerimeter() {
        return side * NUMBER_OF_SIDES;
    }

    @Override
    public String toString() {
        return "Figure: Square, area: " + getArea() + " sq.units"
                + ", perimeter: " + getPerimeter()
                + ", side: " + side
                + ", color: " + color;
    }

    @Override
    public Figure setRandomProperties(ColorSupplier colorSupplier) {
        super.setRandomProperties(colorSupplier);
        this.side = random.nextInt(BOUND);
        return this;
    }
}
