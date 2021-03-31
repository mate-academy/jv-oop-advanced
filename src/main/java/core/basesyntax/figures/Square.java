package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private String color;
    private double sideA;

    public Square(String color, double side) {
        this.color = color;
        this.sideA = side;
    }

    @Override
    public double calculateArea() {
        return sideA * sideA;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase() + ", area: "
                + calculateArea() + " sq. units, sideA length: " + this.sideA
                + " units, color: " + this.color);
    }
}
