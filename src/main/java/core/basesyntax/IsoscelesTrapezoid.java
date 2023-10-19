package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseLength;
    private int heigth;

    public IsoscelesTrapezoid(String colour, int sideLength, int secondSideLength) {
        super(colour, "Isosceles trapezoid");
        this.baseLength = sideLength;
        this.heigth = secondSideLength;
    }

    public int getBaseLength() {
        return baseLength;
    }

    @Override
    public double getArea() {
        return baseLength * heigth * 0.5;
    }

    private int getHeigth() {
        return heigth;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ","
                + " area: " + getArea() + "sq. units,"
                + " colour: " + getColour() + ","
                + " base length: " + getBaseLength() + ","
                + " height " + getHeigth());
    }
}
