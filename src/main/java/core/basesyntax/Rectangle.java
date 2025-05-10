package core.basesyntax;

public class Rectangle extends Figure {
    private final int side1;
    private final int side2;

    public Rectangle(String color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public String getInfo() {
        return "Figure : Rectangle, Color : " + getColor()
                + ", Side1 : " + side1
                + ", Side2 : " + side2
                + ", Area : " + getArea();
    }
}
