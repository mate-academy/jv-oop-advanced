package core.basesyntax.figures;

import core.basesyntax.abstractions.Figure;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure "
                        + "rectangle"
                        + ", area:"
                        + calculateArea()
                        + ", side A = "
                        + sideA
                        + ", side B = "
                        + sideB
                        + ", color: " + super.getColor());
    }
}
