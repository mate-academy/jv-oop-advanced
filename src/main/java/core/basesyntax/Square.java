package core.basesyntax;

public class Square extends Figure {

    public Square(String color, double side) {
        super(color, side);
    }

    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units,"
                + " side: " + sideOrRadius + " units,"
                + " color: " + color);
    }

    @Override
    public double getArea() {
        return sideOrRadius * sideOrRadius;
    }
}
