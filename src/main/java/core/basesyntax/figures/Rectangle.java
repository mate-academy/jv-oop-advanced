package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.FigureType;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(int sideB, int sideA, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.RECTANGLE.name()
                + ", area: " + area() + " sq. units"
                    + ", length: " + sideA + " units, " + "sideDown: " + sideB + " units, "
                    + "color: " + getColor());
    }

    @Override
    public double area() {
        return sideB * sideA;
    }
}
