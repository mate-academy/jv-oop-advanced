package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double firstline;

    public Square() {
    }

    public Square( String color, double firstline) {
        super(color);
        this.firstline = firstline;
    }

    @Override
    public double getArea() {
        return firstline * firstline;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square" + ", color= " + color + ", area= " + getArea()
                + " unit sq., Length A=" + firstline + " unit sq.");
    }
}
