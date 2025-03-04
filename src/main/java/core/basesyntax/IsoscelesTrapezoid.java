package core.basesyntax;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class IsoscelesTrapezoid extends Figure {
    private double bottomSide;
    private double upperSide;
    private double side;

    public IsoscelesTrapezoid() {

    }

    public IsoscelesTrapezoid(String color,double bottomSide, double upperSide, double side) {
        setColor(color);
        this.bottomSide = bottomSide;
        this.upperSide = upperSide;
        this.side = side;
    }

    public double getUpperSide() {
        return upperSide;
    }

    public void setUpperSide(double upperSide) {
        this.upperSide = upperSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(double bottomSide) {
        this.bottomSide = bottomSide;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculateHeight() {
        return sqrt(pow(getSide(), 2) * pow((bottomSide - upperSide) / 2, 2));
    }

    @Override
    public void calculateArea() {
        setArea(((getBottomSide() + getUpperSide()) * calculateHeight()) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, upper | bottom | side: "
                + getUpperSide() + " | " + getBottomSide() + " | "
                + getSide() + ", color:" + getColor());
    }
}
