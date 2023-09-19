package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((firstSide + secondSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid | first side length: "
                + String.format("%.2f", firstSide) + " | second side length: "
                + String.format("%.2f", secondSide) + " | height: "
                + String.format("%.2f", height) + " | area: "
                + String.format("%.2f", calculateArea()) + " | color: "
                + getColor());
    }
}
