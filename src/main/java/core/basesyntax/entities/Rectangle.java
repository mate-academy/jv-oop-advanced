package core.basesyntax.entities;

import core.basesyntax.service.ColorSupplier;
import java.util.Random;

public class Rectangle extends Figure {
    private Integer base;
    private Integer side;

    public Rectangle() {
    }

    public Rectangle(Random random) {
        this.random = random;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return base * side;
    }

    @Override
    double getPerimeter() {
        return COEFFICIENT_TWO * (base + side);
    }

    @Override
    public String toString() {
        return "Figure: Rectangle, area: " + getArea() + " sq.units"
                + ", perimeter: " + getPerimeter()
                + ", base: " + base
                + ", side: " + side
                + ", color: " + color;
    }

    @Override
    public Figure setRandomProperties(ColorSupplier colorSupplier) {
        super.setRandomProperties(colorSupplier);
        this.side = random.nextInt(BOUND);
        this.base = random.nextInt(BOUND);
        return this;
    }
}
