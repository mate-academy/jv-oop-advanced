package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.IShape;

public class RightTriangle extends Figure implements IShape {
    private double legA;
    private double legB;

    public RightTriangle(double legA, double legB, String name) {
        this.legA = legA;
        this.legB = legB;
        setName(name);
    }

    @Override
    public double getArea() {
        return (legA * legB) / 2;
    }

    @Override
    public void draw() {

        System.out.println("Figure: " + this.getName()
                + ", area: " + this.getArea()
                + " sq. units, leg a: " + this.legA
                + " units, leg b: " + this.legB
                + " units, color: " + this.getColor());
    }

    public double getLegA() {
        return legA;
    }

    public double getLegB() {
        return legB;
    }
}
