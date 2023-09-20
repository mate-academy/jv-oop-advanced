package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle | first leg length: "
                + String.format("%.2f", firstLeg) + " | second leg length: "
                + String.format("%.2f", secondLeg) + " | area: "
                + String.format("%.2f", calculateArea()) + " | color: "
                + getColor());
    }
}
