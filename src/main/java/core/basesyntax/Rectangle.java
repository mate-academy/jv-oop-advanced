package core.basesyntax;

public class Rectangle extends Figure {
    private int upperSide;
    private int lowerSide;

    public Rectangle(String color, int upperSide, int lowerSide) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
    }

    @Override
    public void draw() {
        System.out.println("Name: " + getClass().getSimpleName()
                + ", Color: " + getColor()
                + ", UpperSide: " + upperSide + " units."
                + ", LowerSide: " + lowerSide + " units."
                + ", Area: " + getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return lowerSide * upperSide;
    }
}
