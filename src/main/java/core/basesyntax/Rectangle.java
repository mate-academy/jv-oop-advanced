package core.basesyntax;

import abstracts.Figure;
import enums.Colors;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(Colors color, double sideA, double sideB) {
        super(color);

        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    @Override
    public double getArea() {
        return getSideA() * getSideB();
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + this.getArea()
                + " sq. units, "
                + "firstSide: "
                + this.getSideA()
                + " units, "
                + "secondSide: "
                + this.getSideB()
                + " units, color: "
                + this.getColor());
    }
}
