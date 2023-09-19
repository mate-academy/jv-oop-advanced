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
        System.out.printf("Figure: Isosceles Trapezoid | first side length: %.2f |"
                        + " second side length: %.2f | height: %.2f | area: %.2f | color: %s\n",
                firstSide, secondSide, height, calculateArea(), getColor());
    }
}
