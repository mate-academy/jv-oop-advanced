package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideOne;
    private int sideTwo;
    private int height;

    public IsoscelesTrapezoid(String figureProperty, String color, int sideOne,
                              int sideTwo, int height) {
        super(figureProperty, color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.height = height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getFigureProperty() + ", area: "
                + getParameters() + " sq. units, sideOne: " + getSideOne()
                + " units, sideTwo: " + getSideTwo() + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }

    @Override
    public double getParameters() {
        return (sideOne + sideTwo) * height / 2.0;
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
}
