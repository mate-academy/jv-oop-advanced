package core.basesyntax.model;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                        + " sq.units, sideA: " + sideA
                        + ", sideB: " + sideB
                        + ", colour: " + getColour());
    }

}
