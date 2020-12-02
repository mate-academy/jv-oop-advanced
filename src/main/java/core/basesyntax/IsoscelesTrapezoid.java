package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int lowSide;
    private int highSide;
    private int side;

    public IsoscelesTrapezoid() {
        this.lowSide = new Random().nextInt(10);
        this.highSide = new Random().nextInt(10);
        this.side = new Random().nextInt(10);
        setColor();
        toString();
    }

    public double getLowSide() {
        return lowSide;
    }

    public void setLowSide(int lowSide) {
        this.lowSide = lowSide;
    }

    public double getHighSide() {
        return highSide;
    }

    public void setHighSide(int highSide) {
        this.highSide = highSide;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.round((lowSide + highSide) / 4
                * Math.sqrt(4 * side * side - (lowSide - highSide) * (lowSide - highSide)));
    }

    public double getMiddleLine() {
        return Math.round((lowSide + highSide) / 2);
    }

    @Override
    public String toString() {
        return super.toString() + " isoscelesTrapezoid, "
                + " area: " + getArea()
                + " color: " + getColor()
                + " lowSide: " + getLowSide()
                + " highSide: " + getHighSide()
                + " side: " + getSide()
                + " middleLine: " + getMiddleLine();
    }
}
