package core.basesyntax;

public class RightTriangle extends Figure {
    private int side1;
    private int side2;

    public RightTriangle(String figureProperty, String color, int side1, int side2) {
        super(figureProperty, color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getFigureProperty() + ", area: " + getParameters()
                + " sq. units, hypotenuse: " + hypotenuse()
                + " units, color: " + getColor());
    }

    @Override
    public double getParameters() {
        return side1 * side2 / 2.0;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide1() {
        this.side1 = side1;
    }

    public void setSide2() {
        this.side2 = side2;
    }

    public double hypotenuse() {
        return Math.hypot(side1, side2);
    }
}
