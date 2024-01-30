package core.basesyntax;

public class Rectangle extends Figure {
    private int oneSide;
    private int secondSide;

    public Rectangle(String color, int oneSide, int secondSide) {
        this.setColor(color);
        this.oneSide = oneSide;
        this.secondSide = secondSide;
        calcArea();
    }

    @Override
    public void calcArea() {
        setArea(oneSide * secondSide);
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea() + " sq. units, oneside: "
                + oneSide + " units," + " secondSide: " + secondSide + " units,"
                + " color: " + getColor();
    }
}
