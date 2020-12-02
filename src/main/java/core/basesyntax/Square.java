package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private double side;

    public Square() {
        this.side = new Random().nextInt(10);
        setColor();
        toString();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.round(side * side);
    }

    public double getDiagonal() {
        return Math.round(side * Math.sqrt(2));
    }

    @Override
    public String toString() {
        return super.toString() + " square, "
               + " area: " + getArea()
               + " color: " + getColor()
               + " side: " + getSide()
               + " diagonal: " + getDiagonal();
    }
}
