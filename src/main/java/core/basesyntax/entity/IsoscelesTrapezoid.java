package core.basesyntax.entity;

import java.awt.*;

public class IsoscelesTrapezoid extends Figure{
    private double side;
    private double upperBase;
    private double lowerBase;

    public IsoscelesTrapezoid(Color color, double side, double upperBase, double lowerBase) {
        super(color);
        this.side = side;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(double lowerBase) {
        this.lowerBase = lowerBase;
    }

    @Override
    public void printSquare() {

    }
}
