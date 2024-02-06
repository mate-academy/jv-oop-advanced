package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int downLength;
    private int upLength;
    private int heightLength;

    public IsoscelesTrapezoid(String color, int downLength, int upLength, int heightLength) {
        super(color);
        this.downLength = downLength;
        this.upLength = upLength;
        this.heightLength = heightLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid"
                + ", area: " + getArea() + " sq.units,"
                + " downLength: " + getDownLength() + " units,"
                + " upLength: " + getUpLength() + " units,"
                + " heightLength: " + getHeightLength() + " units,"
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((downLength + upLength) / 2) * heightLength;
    }

    public int getDownLength() {
        return downLength;
    }

    public void setDownLength(int downLength) {
        this.downLength = downLength;
    }

    public int getUpLength() {
        return upLength;
    }

    public void setUpLength(int upLength) {
        this.upLength = upLength;
    }

    public int getHeightLength() {
        return heightLength;
    }

    public void setHeightLength(int heightLength) {
        this.heightLength = heightLength;
    }
}
