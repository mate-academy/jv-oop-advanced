package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        setSide(side);
        setColor();
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
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
    public String draw() {
        return super.draw() + " square, "
               + " area: " + getArea()
               + " color: " + getColor()
               + " side: " + getSide()
               + " diagonal: " + getDiagonal();
    }
}
