package core.basesyntax.figure;

import core.basesyntax.tools.Color;

public class IsoscelesTrapezoid extends Figure {
    private int leftSide;
    private int rightSide;
    private double area;

    public IsoscelesTrapezoid(String name, Color color, int leftSide, int rightSide) {
        super(name, color);
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        resultArea();
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    public int getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(int leftSide) {
        this.leftSide = leftSide;
    }

    public int getRightSide() {
        return rightSide;
    }

    public void setRightSide(int rightSide) {
        this.rightSide = rightSide;
    }

    public void resultArea() {
        setArea(
                (1 / 2)
                * getLeftSide()
                * Math.sqrt((getRightSide() * getRightSide())
                        - ((getLeftSide() * getLeftSide()) / 4))
        );
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" area: " + getArea() + " sq.units"
                + ", base: " + getLeftSide() + " units, "
                + "side: " + getRightSide() + " units, "
                + "color: " + getColor().name());
    }
}
