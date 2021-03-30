package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side1;
    private int side2;
    private int height;

    public IsoscelesTrapezoid(String figureProperty, String color, int side1,
                              int side2, int height) {
        super(figureProperty, color);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;

    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getFigureProperty() + ", area: "
                + getParameters() + " sq. units, side1: " + getSide1()
                + " units, side2: " + getSide2() + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }

    @Override
    public double getParameters() {
        return (side1 + side2) * height / 2.0;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
