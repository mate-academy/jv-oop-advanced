package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowSide;
    private int highSide;
    private int side;

    public IsoscelesTrapezoid(int lowSide,int highSide,int side,Color color) {
        setLowSide(lowSide);
        setHighSide(highSide);
        setSide(side);
        setColor(color);
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
    public String draw() {
        return "Figure:" + " isoscelesTrapezoid, "
                + " area: " + getArea()
                + " color: " + getColor()
                + " lowSide: " + getLowSide()
                + " highSide: " + getHighSide()
                + " side: " + getSide()
                + " middleLine: " + getMiddleLine();
    }
}
