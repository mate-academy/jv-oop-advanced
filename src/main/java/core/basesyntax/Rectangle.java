package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String colour, int sideA, int sideB) {
        super(colour);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, first side: "
                + sideA + " units, second side: " + sideB + " units, colour: " + getColour());
    }
}
