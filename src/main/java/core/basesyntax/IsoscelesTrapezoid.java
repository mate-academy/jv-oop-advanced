package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int middleLine;
    private int height;

    public int getMiddleLine() {
        return middleLine;
    }

    public void setMiddleLine(int middleLine) {
        this.middleLine = middleLine;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return middleLine * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "isoscelesTrapezoid, " + "area: "
                + getArea() + " sq.units, " + "middle line: "
                + middleLine + " units, " + "height: "
                + height + " units, " + "color: " + getColor());
    }
}
