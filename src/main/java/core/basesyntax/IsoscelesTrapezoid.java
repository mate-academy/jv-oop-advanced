package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideOne;
    private int sideTwo;
    private int height;

    public int getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int side2) {
        this.sideTwo = side2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, " + " area: " + getArea()
                + " sq.units, " + " side1: " + getSideOne() + ", " + " side2: "
                + getSideTwo() + ", " + " height: " + getHeight() + " units, "
                + " color; " + getColor());
    }

    @Override
    public double getArea() {
        return ((sideOne + sideTwo) / 2) * height;
    }
}
