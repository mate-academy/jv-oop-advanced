package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double firstLine;
    private double secondLine;
    private double thirdLine;

    public IsoscelesTrapezoid(String color,
                              double firstLine, double secondLine, double thirdLine) {
        super(color);
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
    }

    @Override
    public double getArea() {
        return (firstLine + secondLine) * thirdLine / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid" + ", color= " + color
                + ", area= " + getArea()
                + " unit sq., Length A=" + firstLine
                + " unit sq., Length B= " + secondLine + " unit sq."
                + " " + thirdLine + " unit sq.");
    }
}
