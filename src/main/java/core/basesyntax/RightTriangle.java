package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private int sideLength;

    public RightTriangle(String colour, int sideLength) {
        super(colour, "Right triangle");
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) * sideLength * sideLength) / 4;
    }

    @Override
    public void drawFigure() {
        DecimalFormat dec = new DecimalFormat("#0.0");
        System.out.println("Figure: " + getName() + ","
                + " area: " + dec.format(getArea()) + " sq. units,"
                + " colour: " + getColour() + ","
                + " sideLength: " + getSideLength());
    }
}
