package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideOne;
    private int sideTwo;

    public RightTriangle(String figureProperty, String color, int sideOne, int sideTwo) {
        super(figureProperty, color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getFigureProperty() + ", area: " + getParameters()
                + " sq. units, hypotenuse: " + hypotenuse()
                + " units, color: " + getColor());
    }

    @Override
    public double getParameters() {
        return sideOne * sideTwo / 2.0;
    }

    public int getSideOne() {
        return sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public void setSideOne() {
        this.sideOne = sideOne;
    }

    public void setSideTwo() {
        this.sideTwo = sideTwo;
    }

    public double hypotenuse() {
        return Math.hypot(sideOne, sideTwo);
    }
}
