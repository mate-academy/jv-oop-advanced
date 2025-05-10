package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

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
    public void drawInfo() {
        System.out.println("Figure: Rectangle, area: "
                + Math.round(calculateArea() * 10.0) / 10.0 + " sp. units, first side " + (int)sideA
                + " units, second side " + (int)sideB + " units, color: " + color.toLowerCase());
    }
}

