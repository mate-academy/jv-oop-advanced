package core.basesyntax;

public class Rectangle extends Figure{
    private int sideOne;
    private int sideTwo;

    public Rectangle(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
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

    @Override
    public double obtainArea() {
        return sideOne * sideTwo;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + obtainArea()
                + " sq. units, sideOne " + sideOne + " units, sideTwo: "
                + sideTwo + " units, color: " + getColor().name());
    }
}
