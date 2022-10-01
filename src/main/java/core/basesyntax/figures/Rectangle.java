package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double sideA = 0;
    private double sideB = 0;

    public Rectangle(String colour, double sideA, double sideB) {
        super(colour);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Figure: " + Figures.RECTANGLE.name().toLowerCase() + ", area:" + getArea()
                + " sq.units, sideA: " + sideA + " , sideB: " + sideB
                + " units, color: " + getColour();
    }
}
