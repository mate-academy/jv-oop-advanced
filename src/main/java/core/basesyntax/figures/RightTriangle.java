package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;
import java.util.Random;

public class RightTriangle extends Figure {

    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        String sb = "Figure: Right Triangle, Color: " + getColor() + ", First Leg: " + getFirstLeg() + ", Second Leg: " + getSecondLeg() + ", Area: " + getArea();

        System.out.println(sb);
    }
}
