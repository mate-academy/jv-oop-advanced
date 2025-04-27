package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private int sideOne;
    private int sideTwo;
    private int height;

    public IsoscelesTrapezoid(int sideOne, int sideTwo, int height) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.height = height;
    }

    public int getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double obtainArea() {
        return ((double) (sideOne + sideTwo)) / 2 * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + obtainArea()
                + " sq. units, sideOne " + sideOne + " units, sideTwo: "
                + sideTwo + " units, height: " + height + " units, color: "
                + getColor().name());
    }
}
