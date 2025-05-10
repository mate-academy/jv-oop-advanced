package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double firstLine;

    public Square(String color, double firstLine) {
        super(color);
        this.firstLine = firstLine;
    }

    @Override
    public double getArea() {
        return firstLine * firstLine;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square" + ", color= " + color + ", area= " + getArea()
                + " unit sq., Length A=" + firstLine + " unit sq.");
    }
}
