package core.basesyntax.model.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
        setIdentification("square");
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", getArea: "
                + getArea() + " sq. units, side length: " + getSide()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
