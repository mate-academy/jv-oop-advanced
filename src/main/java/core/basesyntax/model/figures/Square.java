package core.basesyntax.model.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
        setIdentification("square");
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, side length: " + getSide()
                + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public Figure getFigure() {
        return new Square(Math.random() * 50);
    }
}
