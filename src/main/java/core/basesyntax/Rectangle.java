package core.basesyntax;

public class Rectangle extends Figure {

    public Rectangle(String color, double side, double secondSide) {
        super(color, side, secondSide);
    }

    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units,"
                + " height: " + sideOrRadius + " units,"
                + " width: " + secondSide + " units,"
                + " color: " + color);
    }

    @Override
    public double getArea() {
        return sideOrRadius * secondSide;
    }
}
