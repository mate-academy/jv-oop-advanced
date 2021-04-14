package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double sideA;
    private double height;

    public RightTriangle(String color, double sideA, double height) {
        super(color);
        this.sideA = sideA;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (sideA * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase() + ", area: "
                + calculateArea() + " sq. units, sideA length: " + this.sideA
                + " units, sideA length: " + this.height
                + " units, color: " + this.getColor());
    }
}
