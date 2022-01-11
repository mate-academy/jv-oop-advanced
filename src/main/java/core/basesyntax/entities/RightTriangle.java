package core.basesyntax.entities;

import core.basesyntax.service.ColorSupplier;
import java.util.Random;

public class RightTriangle extends Figure {
    private Integer firstLeg;
    private Integer secondLeg;
    private Integer hypotenuse;

    public RightTriangle() {
    }

    public RightTriangle(Random random) {
        this.random = random;
    }

    public Integer getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(Integer firstLeg) {
        this.firstLeg = firstLeg;
    }

    public Integer getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(Integer secondLeg) {
        this.secondLeg = secondLeg;
    }

    public Integer getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(Integer hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    @Override
    double getArea() {
        return (double) firstLeg * secondLeg / COEFFICIENT_TWO;
    }

    @Override
    double getPerimeter() {
        return firstLeg + secondLeg + hypotenuse;
    }

    @Override
    public String toString() {
        return "Figure: RightTriangle, area: " + getArea() + " sq.units"
                + ", perimeter: " + getPerimeter()
                + ", firstLeg: " + firstLeg
                + ", secondLeg: " + secondLeg
                + ", hypotenuse:" + hypotenuse
                + ", color: " + color;
    }

    @Override
    public Figure setRandomProperties(ColorSupplier colorSupplier) {
        super.setRandomProperties(colorSupplier);
        this.firstLeg = random.nextInt(BOUND);
        this.secondLeg = random.nextInt(BOUND);
        this.hypotenuse = random.nextInt(BOUND);
        return this;
    }
}
